package miniproject;

import javax.swing.JOptionPane;

public class FortuneTelling extends javax.swing.JFrame {

    public FortuneTelling() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdlMon = new javax.swing.JRadioButton();
        rdlThurs = new javax.swing.JRadioButton();
        rdlSun = new javax.swing.JRadioButton();
        rdlWednes = new javax.swing.JRadioButton();
        rdlFri = new javax.swing.JRadioButton();
        rdlTues = new javax.swing.JRadioButton();
        rdlSatur = new javax.swing.JRadioButton();
        btnPredict = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarCharacter = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarCharacterLove = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        lblPersen = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fortune Telling");
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("ทำนายดวงความรักตามวันเกิด");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("วันเกิด");

        buttonGroup1.add(rdlMon);
        rdlMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlMon.setText("วันจันทร์");
        rdlMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlMonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlThurs);
        rdlThurs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlThurs.setText("วันพฤหัสบดี");
        rdlThurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlThursActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlSun);
        rdlSun.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlSun.setText("วันอาทิตย์");
        rdlSun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlSunActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlWednes);
        rdlWednes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlWednes.setText("วันพุธ");
        rdlWednes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlWednesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlFri);
        rdlFri.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlFri.setText("วันศุกร์");
        rdlFri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlFriActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlTues);
        rdlTues.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlTues.setText("วันอังคาร");
        rdlTues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlTuesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlSatur);
        rdlSatur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlSatur.setText("วันเสาร์");
        rdlSatur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlSaturActionPerformed(evt);
            }
        });

        btnPredict.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPredict.setText("ทำนาย");
        btnPredict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPredictActionPerformed(evt);
            }
        });

        tarCharacter.setColumns(20);
        tarCharacter.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        tarCharacter.setRows(5);
        jScrollPane1.setViewportView(tarCharacter);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("นิสัย");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("นิสัยเวลามีความรัก");

        tarCharacterLove.setColumns(20);
        tarCharacterLove.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        tarCharacterLove.setRows(5);
        jScrollPane2.setViewportView(tarCharacterLove);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("ระดับความคลั่งรัก");

        lblPersen.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblPersen.setForeground(new java.awt.Color(255, 51, 51));
        lblPersen.setText("00 %");

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(rdlThurs))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(37, 37, 37)
                                    .addComponent(rdlMon))
                                .addComponent(rdlSun, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdlTues)
                                    .addComponent(rdlFri))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdlWednes)
                                    .addComponent(rdlSatur)))
                            .addComponent(btnPredict, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPersen))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rdlMon))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdlThurs)
                            .addComponent(rdlSatur)
                            .addComponent(rdlFri)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdlWednes)
                        .addComponent(rdlTues)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdlSun)
                    .addComponent(btnPredict))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersen)
                    .addComponent(jLabel5))
                .addGap(55, 55, 55)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdlMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlMonActionPerformed

    private void rdlThursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlThursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlThursActionPerformed

    private void rdlSunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlSunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlSunActionPerformed

    private void rdlWednesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlWednesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlWednesActionPerformed

    private void rdlFriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlFriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlFriActionPerformed

    private void rdlTuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlTuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlTuesActionPerformed

    private void rdlSaturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlSaturActionPerformed
        // TODO addr handling code here:
    }//GEN-LAST:event_rdlSaturActionPerformed

    private void btnPredictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPredictActionPerformed
        if (rdlMon.isSelected()) {
            tarCharacter.setText("ปกติคนที่เกิดวันนี้เป็นคนที่ค่อนข้างแพรวพราว\nเป็นคนที่ค่อนข้างจะรักอิสระ \nดูเป็นคนเจ้าชู้ไม่รู้ตัว \nเพราะเป็นคนมีเสน่ห์ วางตัวดี");
            tarCharacterLove.setText("ถ้ามีความรักขึ้นมาล่ะก็เหมือนเป็นคนละคน!\nจากเสีอตัวใหญ่พอมีแฟนแล้วจะกลายเป็นแมวน้อย\nขี้อ้อน เอาใจ อยากได้อะไรจัดให้ทุกอย่าง\nงอแงกับแฟนเพราะอยากเรียกร้องความสนใจ\nถ้าคบกันแล้วก็อยากให้ดูแลเอาอกเอาใจซึ่งกันและกัน\nมือถือนี่ถ้าไม่ล็อกรหัสก็เรียบร้อย!\nเพราะคนเกิดวันนี้จะแอบหึง แอบส่องทุกอย่าง\nแฟนไปไหน ทำอะไร อยู่กับใคร รู้หมด!\nแต่คนที่เกิดวันจันทร์ถึงจะมีแฟนยังไงก็ยังไม่ทิ้งเพื่อน\nถ้าอีกฝ่ายเข้าใจไม่คิดมากก็คบกันได้ยาวๆ จ้า");
            lblPersen.setText("90%");
        } else if (rdlTues.isSelected()) {
            tarCharacter.setText("คนเกิดวันนี้เป็นพ่อแม่บุญทุ่มเวลารักใครจะจริงจังมากระดับสิบ!\nเป็นคนใจร้อนตอบช้า 5 นาทีจะรู้สึกใจหายแล้ว\nว่าเราพูดอะไรผิดไปไหมนะ? หรือว่าเขาไม่อยากคุยกับเราหรือเปล่า?\nหรือว่าเกิดเหตุร้ายอะไรขึ้น เอ๊ะ!\nหรือว่าแอบคุยกับคนอื่น");
            tarCharacterLove.setText("ถ้าอยู่ในช่วงอินเลิฟแล้วจะอารมณ์ดีทั้งวัน\nยิ้มคนเดียว เป็นคนติดแฟน อยากอยู่ด้วยตลอดเวลา\nเธออยู่ที่ไหน จะไปอยู่ตรงหน้า จะไปหาแน่ๆ!\nและค่อนข้างคาดหวังในตัวคนรักมากๆ\nถ้าให้ 100 ต้องได้กลับมา 100 ชอบอะไรที่แฟร์ๆ\nถ้าไม่แฟร์ก็หาใหม่ ชอบความตื่นเต้นท้าทาย\nถ้าอีกฝ่ายเล่นตัวนิดหน่อย เข้าหาบ้าง เอาใจก่อนบ้าง\nแกล้งไม่ตอบบ้าง ยิ่งตื่นเต้น ยิ่งถ้าอีกฝ่ายใส่ใจ\nและเข้าใจในตัวของคนที่เกิดวันอังคาร\nรับรองว่ารักจนมูฟออนไปไหนไม่ได้!");
            lblPersen.setText("100%");
        } else if (rdlWednes.isSelected()) {
            tarCharacter.setText("คารมดีเป็นที่ 1 ตบมุขโบ๊ะบ๊ะได้ ทันคน เทคนิคอ่อยชั้นครู\nแพรวพราวพอ ๆ กับคนเกิดวันจันทร์ เป็นคนที่ค่อยๆ ดูค่อยๆ\nเก็บข้อมูลฝ่ายตรงข้าม ไม่วู่วาม ชอบนะ\nแต่ไม่แสดงออกตรง ๆ รอจนกว่าจะแน่ใจจริงๆ\nแล้วถึงจะตกลงเป็นแฟน");
            tarCharacterLove.setText("เป็นคนที่รักใครแล้วรักจริง โรแมนติก\nเรื่องเล็กๆน้อยก็จำได้ เอาใจใส่แฟนหรือคนรักมาก\nแต่ข้อเสียของคนที่เกิดวันนี้เป็นเพราะอีโก้ที่สูงเสียดฟ้า\nอาจจะทำให้เรื่องราวที่มันไม่ได้มีอะไรเลยพังได้ง่ายๆ\nเพราะความมีอีโก้ของตัวเอง เวลาโกรธมาก็จะใช้คำพูดที่ไม่ค่อยดี\nเป็นคนคาดหวังกับความรักสูง คิดมาก ขี้หึง ขี้ระแวง\nแล้วพอไม่ได้ตามที่หวังก็อาจจะพาลเบื่อได้ง่ายๆ\nแนะนำให้ใจเย็นๆและลดความคาดหวังกับอีโก้ลงนิดหน่อย\nจะทำให้ความรักไปได้ดี");
            lblPersen.setText("50%");
        } else if (rdlThurs.isSelected()) {
            tarCharacter.setText("ภายนอกอาจจะดูเป็นคนอ่อยเก่ง แพรวพราว\nแต่จริงๆแล้วเป็นคนค่อนข้างอ่อนไหว\nเป็นคนออกจะบ๊องๆ ขาดๆ เกินๆด้วยซ้ำ\nคนเกิดวันนี้ถึงจะดูอ่อยเก่งก็จริง ดูเป็นสาวฮอต หนุ่มฮอต\nแต่รักใครแล้วรักจริงจังมาก ไม่ชอบการนอกใจ\nและการถูกหักหลัง");
            tarCharacterLove.setText("เวลาคนเกิดวันพฤหัสบดีมีความรักแล้วเหมือนเมากัญชา\nอารมณ์ดีทั้งวัน และวันครบรอบ วันเกิด จำได้หมด\nตกหลุมรักคนง่าย ยิ่งถ้าเจอคนที่คุยแบบ Deep Conversation ได้\nยิ่งชอบ ชอบคนที่เป็นผู้ใหญ่ ยิ่งมีทัศนคติดีๆ\nหรือพลังบวก คนที่เกิดวันพฤหัสบดีจะมโนไปถึงขั้นแต่งงานเลย\nทั้ง ๆ ที่แค่เริ่มคุย แต่ก็ชอบความรักที่ค่อยเป็นค่อยไป\nไม่รีบนะ");
            lblPersen.setText("60%");
        } else if (rdlFri.isSelected()) {
            tarCharacter.setText("คนเกิดวันนี้ออกแนวพ่อบ้านใจกล้า ไม่เถียงหรอกนะ\nแต่อย่าให้โกรธ! เป็นคนช่างมโน ชอบเพ้อเงียบๆ\nเป็นตุเป็นตะอยู่คนเดียว และคนเกิดวันนี้เป็นคนอ่อนโยน\nเอาใจใส่แฟนมาก ต้องการให้แฟนเอาใจใส่ตัวเองเหมือนกัน\nถ้าเจอคนที่ทำให้คนเกิดวันศุกร์รู้สึกรักทั้งแฟน\nรักทั้งตัวเองหรือชอบตัวเองตอนอยู่กับแฟน\nจะเป็นอะไรที่เพอร์เฟ็กต์มาก");
            tarCharacterLove.setText("ใครชอบคนสายเปย์มาทางนี้!\nคนเกิดวันศุกร์บอกเลยว่าเปย์เก่งงงง ชอบหาอะไรทำ\nชวนแฟนทำนู่นทำนี่ อยู่ด้วยแล้วไม่มีทางเบื่อแน่นอน\nและมักจะเจอคนที่แตกต่างกันที่ อายุ เชื้อชาติ ศาสนา ฐานะฯลฯ\nแต่ไม่ค่อยสนใจเท่าไร ถ้าพร้อมจะเดินไปด้วยกันก็โอเค\nคบกันได้ยาว ๆ");
            lblPersen.setText("85%");
        } else if (rdlSatur.isSelected()) {
            tarCharacter.setText("คนที่เกิดวันเสาร์ชอบทำตัวเป็นผู้นำ อีโก้สูง บ้าพลัง\nไม่ชอบคนต่อล้อต่อเถียง ฉะนั้นคนที่นิ่งๆ สุขุมหน่อยๆ\nก็จะเข้าทางคนที่เกิดวันนี้ เป็นคนเด็ดขาด ชัดเจน ชอบก็คือชอบ\nไม่ยึกๆ ยักๆ ชอบคนเอาใจ ใส่ใจ ชอบอะไรที่เรียบง่าย\nมั่นคง ถ้ามีแฟนแล้วก็จะทุ่มสุด ๆ");
            tarCharacterLove.setText("อยากได้อะไรบอกจะจัดให้ตามที่ขอทุกอย่างยกเว้นให้ลุงลาออก\n(เอ๊ย! ไม่ใช่!)ดูแลแฟนหรือคนรักดีเว่อร์!\nเหมือนเราเป็นเจ้าหญิงหรือเจ้าชาย แต่ไม่ชอบอะไรที่จุกจิก\nชนิดว่าตามหึงตามจิกเกินเบอร์จะเบื่อมาก แต่ถึงจะไม่ชอบอะไรแบบนั้น\nคนที่เกิดวันเสาร์เวลาหึงจะน่ากลัวระดับสิบ!");
            lblPersen.setText("70%");
        } else if (rdlSun.isSelected()) {
            tarCharacter.setText("คนที่เกิดวันอาทิตย์เขาว่าเป็นคนอารมณ์ขึ้นๆ ลงๆ\nอาจจะตามอารมณ์ยากสักหน่อย เป็นคนใจกว้าง\nให้อิสระกับคนรัก แต่ถ้าเข้าโหมดจริงจังแล้วไม่ชอบอะไรเล่นๆ\nอยู่ไหน ทำอะไรกับใคร ต้องบอก ต้องรายงาน\nและถ้าชอบใครก็จะทำทุกวิถีทางเพื่อให้ได้คบ");
            tarCharacterLove.setText("พอมีแฟนแล้วโลกสดใส อะไรก็เป็นสีชมพูไปหมด\nถ้ามีแฟนจะขี้บ่นมากๆ แต่ก็เป็นเพราะรักแหละถึงบ่น\nเป็นคนรักเดียวใจเดียว คบใครก็คบทีละคน\nไม่ได้หว่านไปทั่วถ้าเทียบกับคนเกิดวันอื่นๆ\nถ้าเจอแฟนหรือคนรักที่เข้ากับครอบครัวหรือเพื่อนได้ก็ผ่านฉลุย\nเพราะชอบความรักแบบลึกซึ้ง พร้อมที่จะเป็นครอบครัวเดียวกันในอนาคต\nชอบคนพูดเพราะ ใส่ใจ ยิ้มหวาน\nถ้าสอบผ่านก็จะเสมอต้นเสมอปลายกับคนรักมาก ๆ");
            lblPersen.setText("75%");
    }//GEN-LAST:event_btnPredictActionPerformed
    }
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FortuneTelling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FortuneTelling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPredict;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPersen;
    private javax.swing.JRadioButton rdlFri;
    private javax.swing.JRadioButton rdlMon;
    private javax.swing.JRadioButton rdlSatur;
    private javax.swing.JRadioButton rdlSun;
    private javax.swing.JRadioButton rdlThurs;
    private javax.swing.JRadioButton rdlTues;
    private javax.swing.JRadioButton rdlWednes;
    private javax.swing.JTextArea tarCharacter;
    private javax.swing.JTextArea tarCharacterLove;
    // End of variables declaration//GEN-END:variables
}
