#!/usr/bin/perl

use strict;
use warnings;

# Define the input and output file names
my $input_file = 'CucuFeatures.tex';
my $output_dir = 'features';

# Create the output directory if it doesn't exist
unless (-d $output_dir) {
    mkdir $output_dir or die "Error creating output directory: $!";
}

# Read the LaTeX file
open(my $fh, '<', $input_file) or die "Could not open file '$input_file' $!";

# Variable to store the content between \begin{lstlisting} and \end{lstlisting}
my $listing_content = '';

# Variable to track if we are currently inside a listing environment
my $inside_listing = 0;

# Variable to count the extracted listings
my $listing_count = 1;

my $output_file = 'a'; 

while (my $line = <$fh>) {
    
    # Check for \subsubsection{}
    if ($line =~ /\\subsubsection\{Feature .: (.*?)}/) {
        $output_file = "$1.feature";
        $output_file =~ s/ /_/g;
        next;
    }
    
    # Check for \begin{lstlisting}
    if ($line =~ /\\begin\{lstlisting}/) {
        $inside_listing = 1;
        $listing_content = '';
        next;
    }
    
    # Check for \end{lstlisting}
    if ($line =~ /\\end\{lstlisting}/) {
        $inside_listing = 0;
        
        # Write content to a separate file
        my $output_file = "$output_dir/$output_file";
        open(my $output_fh, '>', $output_file) or die "Could not open file '$output_file' $!";
        print $output_fh $listing_content;
        close($output_fh);
        
        $listing_count++;
        next;
    }
    
    # If inside a listing environment, accumulate the content
    if ($inside_listing) {
        $listing_content .= $line;
    }
}

close($fh);

