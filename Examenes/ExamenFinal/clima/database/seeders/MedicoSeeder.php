<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class MedicoSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        DB::table("medico")->insert([
            [
                "id"=>"1",
                "nombre"=>"Marco Antonio",
                "especialidad"=>"neurologo",
                "edad"=>"31",
                "sexo"=>"masculino",
                "telefono"=>"12343412",
                "direccion"=>"palmas n-65"
            ],
            [
                "id"=>"2",
                "nombre"=>"Juan jose",
                "especialidad"=>"pediatra",
                "edad"=>"41",
                "sexo"=>"masculino",
                "telefono"=>"3452345124",
                "direccion"=>"bustillos 34"
            ],
            [
                "id"=>"3",
                "nombre"=>"Maria Jimenez",
                "especialidad"=>"cardiologo",
                "edad"=>"31",
                "sexo"=>"femenino",
                "telefono"=>"928873",
                "direccion"=>"cordoba 32"
            ],
            [
                "id"=>"4",
                "nombre"=>"Ismael Rodrigez",
                "especialidad"=>null,
                "edad"=>"35",
                "sexo"=>"masculino",
                "telefono"=>"42563",
                "direccion"=>"patacon 32"
            ],
            [
                "id"=>"5",
                "nombre"=>"Luz Rodriguez",
                "especialidad"=>null,
                "edad"=>"28",
                "sexo"=>"femenino",
                "telefono"=>"45634",
                "direccion"=>"Echereria 12"
            ]
            ]);
    }
}
