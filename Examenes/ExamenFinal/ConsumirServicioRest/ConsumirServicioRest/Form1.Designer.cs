namespace ConsumirServicioRest
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            button1 = new Button();
            button3 = new Button();
            boxId = new TextBox();
            button4 = new Button();
            button5 = new Button();
            boxDelete = new TextBox();
            PostTemperatura = new TextBox();
            PostFecha = new TextBox();
            PostId = new TextBox();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label6 = new Label();
            label7 = new Label();
            PutId = new TextBox();
            PutFecha = new TextBox();
            PutTemperatura = new TextBox();
            button2 = new Button();
            label8 = new Label();
            SuspendLayout();
            // 
            // button1
            // 
            button1.Location = new Point(841, 69);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 0;
            button1.Text = "GET";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button3
            // 
            button3.Location = new Point(841, 134);
            button3.Name = "button3";
            button3.Size = new Size(75, 23);
            button3.TabIndex = 6;
            button3.Text = "GET+ID";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // boxId
            // 
            boxId.Location = new Point(674, 134);
            boxId.Name = "boxId";
            boxId.Size = new Size(112, 23);
            boxId.TabIndex = 7;
            // 
            // button4
            // 
            button4.Location = new Point(841, 190);
            button4.Name = "button4";
            button4.Size = new Size(75, 23);
            button4.TabIndex = 8;
            button4.Text = "POST";
            button4.UseVisualStyleBackColor = true;
            button4.Click += button4_Click;
            // 
            // button5
            // 
            button5.Location = new Point(841, 247);
            button5.Name = "button5";
            button5.Size = new Size(75, 23);
            button5.TabIndex = 9;
            button5.Text = "DELETE";
            button5.UseVisualStyleBackColor = true;
            button5.Click += button5_Click;
            // 
            // boxDelete
            // 
            boxDelete.Location = new Point(674, 247);
            boxDelete.Name = "boxDelete";
            boxDelete.Size = new Size(112, 23);
            boxDelete.TabIndex = 13;
            // 
            // PostTemperatura
            // 
            PostTemperatura.Location = new Point(674, 190);
            PostTemperatura.Name = "PostTemperatura";
            PostTemperatura.Size = new Size(112, 23);
            PostTemperatura.TabIndex = 14;
            // 
            // PostFecha
            // 
            PostFecha.Location = new Point(459, 190);
            PostFecha.Name = "PostFecha";
            PostFecha.Size = new Size(112, 23);
            PostFecha.TabIndex = 15;
            // 
            // PostId
            // 
            PostId.Location = new Point(297, 190);
            PostId.Name = "PostId";
            PostId.Size = new Size(112, 23);
            PostId.TabIndex = 16;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(274, 190);
            label1.Name = "label1";
            label1.Size = new Size(20, 15);
            label1.TabIndex = 1;
            label1.Text = "Id:";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(415, 194);
            label2.Name = "label2";
            label2.Size = new Size(41, 15);
            label2.TabIndex = 17;
            label2.Text = "Fecha:";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(595, 193);
            label3.Name = "label3";
            label3.Size = new Size(76, 15);
            label3.TabIndex = 18;
            label3.Text = "Temperatura:";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(595, 320);
            label6.Name = "label6";
            label6.Size = new Size(76, 15);
            label6.TabIndex = 27;
            label6.Text = "Temperatura:";
            label6.Click += label6_Click;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(415, 321);
            label7.Name = "label7";
            label7.Size = new Size(41, 15);
            label7.TabIndex = 26;
            label7.Text = "Fecha:";
            label7.Click += label7_Click;
            // 
            // PutId
            // 
            PutId.Location = new Point(297, 317);
            PutId.Name = "PutId";
            PutId.Size = new Size(112, 23);
            PutId.TabIndex = 25;
            PutId.TextChanged += textBox1_TextChanged;
            // 
            // PutFecha
            // 
            PutFecha.Location = new Point(459, 317);
            PutFecha.Name = "PutFecha";
            PutFecha.Size = new Size(112, 23);
            PutFecha.TabIndex = 24;
            PutFecha.TextChanged += textBox2_TextChanged;
            // 
            // PutTemperatura
            // 
            PutTemperatura.Location = new Point(674, 317);
            PutTemperatura.Name = "PutTemperatura";
            PutTemperatura.Size = new Size(112, 23);
            PutTemperatura.TabIndex = 23;
            PutTemperatura.TextChanged += textBox3_TextChanged;
            // 
            // button2
            // 
            button2.Location = new Point(841, 313);
            button2.Name = "button2";
            button2.Size = new Size(75, 23);
            button2.TabIndex = 21;
            button2.Text = "PUT";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(274, 317);
            label8.Name = "label8";
            label8.Size = new Size(20, 15);
            label8.TabIndex = 20;
            label8.Text = "Id:";
            label8.Click += label8_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(969, 519);
            Controls.Add(label6);
            Controls.Add(label7);
            Controls.Add(PutId);
            Controls.Add(PutFecha);
            Controls.Add(PutTemperatura);
            Controls.Add(button2);
            Controls.Add(label8);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(PostId);
            Controls.Add(PostFecha);
            Controls.Add(PostTemperatura);
            Controls.Add(boxDelete);
            Controls.Add(button5);
            Controls.Add(button4);
            Controls.Add(boxId);
            Controls.Add(button3);
            Controls.Add(label1);
            Controls.Add(button1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button button1;
        private Button button3;
        private TextBox boxId;
        private Button button4;
        private Button button5;
        private TextBox boxDelete;
        private TextBox PostTemperatura;
        private TextBox PostFecha;
        private TextBox PostId;
        private Label label1;
        private Label label2;
        private Label label3;
        private Label label6;
        private Label label7;
        private TextBox PutId;
        private TextBox PutFecha;
        private TextBox PutTemperatura;
        private Button button2;
        private Label label8;
    }
}