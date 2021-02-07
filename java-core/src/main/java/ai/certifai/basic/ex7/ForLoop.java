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
package ai.certifai.basic.ex7;

import ai.certifai.util.InputParser;
import ai.certifai.util.OutputParser;

/**
 * For Loop
 *
 * @author codenamewei
 */
public class ForLoop
{
    static OutputParser out;
    static InputParser in;

    public static void main(String[] args)
    {
        in = new InputParser(ForLoop.class);
        out = new OutputParser(ForLoop.class, in);

        int totalUseCases=in.getTotalUseCases();

        for(int i=0 ;i<totalUseCases;++i){
            int linesPerUseCase=in.getCurrentUseCaseTotalLines();

            /**Enter your codes here**/

            for(int j=0;j<linesPerUseCase;++j){
                String tempString=in.getStringInput();
                System.out.println("i = "+i+", j = "+j+". The string output is "+tempString);
                out.evaluate(tempString);

            }

        }

        out.printResult();

    }


}