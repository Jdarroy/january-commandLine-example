package com.test;

import java.util.Arrays;
import org.eclipse.january.dataset.Dataset;
import org.eclipse.january.dataset.DatasetFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		Dataset dataset = DatasetFactory.createFromObject(new double[] { 1,2, 3, 4, 5, 6, 7, 8, 9 });
		// Print the output:
		System.out.println("shape of dataset: " + Arrays.toString(dataset.getShape()));
		System.out.println("toString of dataset: " + dataset.toString());
		System.out.println("toString, with data, of dataset: \n" + dataset.toString(true));
	}
}
