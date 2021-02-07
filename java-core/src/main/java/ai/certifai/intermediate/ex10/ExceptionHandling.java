/*
 * Copyright (c) 2020 CertifAI Sdn. Bhd.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package ai.certifai.intermediate.ex10;

import ai.certifai.util.OutputParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Exception Handling
 *
 * @author codenamewei
 */
public class ExceptionHandling
{
    public static void main(String[] args) throws Exception
    {
        OutputParser out = new OutputParser(ExceptionHandling.class);

        out.evaluate(readFile());
        out.evaluate(divideByZero());
        out.evaluate(retrieveObject());

        out.printResult();
    }

    private static String readFile() throws Exception
    {
        String tempString="";
        String filePathInString = "metadata/sample.txt"; //FILE DID NOT EXIST
        //Rewrite the statement below onwards to catch the exception with try-catch-finally
        try{

            System.out.println("Case 1: readFile()");
            System.out.println("Inside try block.");

            File filePath = new File(filePathInString); //This will not executed. Jump straight to catch block.
            Scanner input = new Scanner(filePath); //Once above failed, this also will not be executed. Jump straight to catch block.
            System.out.println("This will not printed out."); //Bcs above already not executed. Jump straight to catch block.

        }
        catch (Exception e){

            tempString= e.getClass().getCanonicalName();
            System.out.println("Inside catch block.");
            System.out.println("Nothing execute in catch block.");
            return e.getClass().getCanonicalName();
        }
        finally{

            System.out.println("Inside finally block.");
            System.out.println("We're done here.");
            System.out.println(tempString);
            return tempString;


        }

    }

    private static String divideByZero() throws Exception
    {
        String tempString="";
        try{

            System.out.println("----------------------------------");
            System.out.println("Case 2: dividedByZero()");
            System.out.println("Inside try block.");
            int value = 1000 / 0; //If this statement is true and be executed, it will go to try block then finally block.
                                  //It does not need to go to catch block for any exception.
            System.out.println("Cannot execute inside try block."); //This will not be printed since above statement
                                                                    //is already failed and not executed. Jump to catch block.

        }
        catch (Exception e){

            tempString= e.getClass().getCanonicalName();
            System.out.println("Inside catch block.");
            System.out.println("Exception caught in catch block.");
            return e.getClass().getCanonicalName();
        }
        finally{

            System.out.println("Inside finally block.");
            System.out.println(tempString);
            return tempString;


        }

    }

    private static String retrieveObject() throws Exception
    {
        String tempString="";
        String buffer = null;
        try{

            System.out.println("----------------------------------");
            System.out.println("Case 3: retrieveObject()");
            System.out.println("Inside try block.");
            buffer.length(); //This statement will never execute since we cannot get length for String data type.
            System.out.println("You wont see this printed,");//This will not be printed out. Jump to catch block.

        }
        catch (Exception e){

            tempString= e.getClass().getCanonicalName();
            System.out.println("Inside catch block.");
            return e.getClass().getCanonicalName();
        }
        finally{

            System.out.println("Inside finally block.");
            System.out.println("We're done here.");
            System.out.println(tempString);
            return tempString;

        }

    }
}
