using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            ServiceReference1.OperacionesSoapClient servicio = new ServiceReference1.OperacionesSoapClient();

            string fechasdata = servicio.fechas();
            string[] fechasA = fechasdata.Split(',');
            for (int i = 0; i < fechasA.Length; i++)
            {
                fecha.Items.Add(fechasA[i]);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {



            ServiceReference1.OperacionesSoapClient servicio = new ServiceReference1.OperacionesSoapClient();

            
            string fechad = fecha.Text;
            string opciond = opcion.Text;
            if(fechad.Length > 0 && opciond.Length >0)
            {
                if (opciond == "TEMPERATURA")
                {
                    opciond = "temperatura";
                }
                else
                {
                    opciond = "probabilidad";
                }
                string resultado =servicio.pronostico(opciond + ":"+fechad);
                label1.Text = resultado;
            }
        }
    }
}
