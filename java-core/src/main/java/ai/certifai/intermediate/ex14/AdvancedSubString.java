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
package ai.certifai.intermediate.ex14;

import ai.certifai.util.InputParser;
import ai.certifai.util.OutputParser;

/**
 * SubString
 *
 * @author codenamewei
 */
public class AdvancedSubString
{
    static OutputParser out;
    static InputParser in;

    public static void main(String[] args)
    {
        in = new InputParser(AdvancedSubString.class);
        out = new OutputParser(AdvancedSubString.class, in);

        int totalUseCases = in.getTotalUseCases();

        for(int i = 0; i < totalUseCases; ++i)
        {
            String input = in.getStringInput();

            out.evaluate(processString(input));
        }

        out.printResult();
    }

    private static String processString(String input)
    {
        /**
         Modify your code in this function
         Do the accordingly changes to this function to reach the successful run of the code
         Change the returning value in line 55
         */
        String tempInput=""; //create empty string
        String tempInput1=" ";
        String tempInput2=" ";

        //using try catch

        /*try ((input.contains("."))) {

            //To remove extension
            tempInput = input.replace(input.substring(input.indexOf(".")),"") ;

            //To trim spaces begin and end space
            tempInput1 = tempInput.trim();

            //To replace space with underscore
            tempInput2 = tempInput1.replace(" ","_");
        }

        catch (Exception e) {

            tempInput1=input.trim();
            tempInput2 = tempInput1.replace(" ","_");


        }*/

        // Alternatively, can use if-else statement.
        // Uncomment either one of the code (try-catch or if-else to run).

        if ((input.contains("."))) {

            //To remove extension
            tempInput = input.replace(input.substring(input.indexOf(".")),"") ;

            //To trim spaces begin and end space
            tempInput1 = tempInput.trim();

            //To replace space with underscore
            tempInput2 = tempInput1.replace(" ","_");
        }

        else {

            tempInput1=input.trim();
            tempInput2 = tempInput1.replace(" ","_");


        }

        System.out.println("----------------------------");
        System.out.println("Original: "+input);
        System.out.println("Remove extension: "+tempInput);
        System.out.println("Trim front and end space: "+tempInput1);
        System.out.println("Replace space with _ : " +tempInput2);

        return tempInput2;
    }

}

