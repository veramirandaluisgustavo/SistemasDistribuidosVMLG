using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsumirServicioRest
{
    internal class Cuenta
    {
        public int id { get; set; }
        public string numero_cuenta { get; set; }
        public string moneda { get; set; }
        public double saldo { get; set; }
        public double codigo_cliente { get; set; }
        public string created_at { get; set; }
        public string update_at { get; set; }
    }
}



