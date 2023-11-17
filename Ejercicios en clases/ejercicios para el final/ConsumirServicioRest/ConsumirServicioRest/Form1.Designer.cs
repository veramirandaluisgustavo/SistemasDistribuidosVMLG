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
            button3 = new Button();
            boxId = new TextBox();
            SuspendLayout();
            // 
            // button3
            // 
            button3.Location = new Point(227, 85);
            button3.Name = "button3";
            button3.Size = new Size(124, 23);
            button3.TabIndex = 6;
            button3.Text = "GET+CUENTA";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // boxId
            // 
            boxId.Location = new Point(109, 85);
            boxId.Name = "boxId";
            boxId.Size = new Size(112, 23);
            boxId.TabIndex = 7;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(553, 332);
            Controls.Add(boxId);
            Controls.Add(button3);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private Button button3;
        private TextBox boxId;
    }
}