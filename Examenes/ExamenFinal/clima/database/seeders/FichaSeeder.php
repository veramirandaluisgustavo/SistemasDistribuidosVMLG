<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class FichaSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        DB::table("ficha")->insert([
            [
                "ci"=>"9123",
                "nombre"=>"carlos herrera",
                "estado"=>"pendiente",
                "cola_id"=>"1"
            ],
            [
                "ci"=>"2136453",
                "nombre"=>"Jimena Torrez",
                "estado"=>"pendiente",
                "cola_id"=>"2"
            ],
            [
                "ci"=>"83932",
                "nombre"=>"Camila Ruiz",
                "estado"=>"pendiente",
                "cola_id"=>"3"
            ],
            [
                "ci"=>"535143",
                "nombre"=>"Sergio Gonzales",
                "estado"=>"pendiente",
                "cola_id"=>"4"
            ],
            [
                "ci"=>"36543",
                "nombre"=>"Jorge Villaruel",
                "estado"=>"pendiente",
                "cola_id"=>"5"
            ],
        ]);
    }
}
