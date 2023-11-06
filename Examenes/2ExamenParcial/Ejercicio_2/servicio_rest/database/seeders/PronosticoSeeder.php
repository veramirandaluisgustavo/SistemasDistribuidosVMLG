<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class PronosticoSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        DB::table("pronostico")->insert([
            [
                "id"=>"1",
                "fecha"=>"04-02-21",
                "temperatura"=>"21",
                "probabilidad"=>"36.74%"
            ],
            [
                "id"=>"2",
                "fecha"=>"05-02-21",
                "temperatura"=>"22",
                "probabilidad"=>"80%"
            ],
            [
                "id"=>"3",
                "fecha"=>"06-02-21",
                "temperatura"=>"25",
                "probabilidad"=>"1.26%"
            ],
            [
                "id"=>"4",
                "fecha"=>"07-02-21",
                "temperatura"=>"26",
                "probabilidad"=>"0.42%"
            ],
            [
                "id"=>"5",
                "fecha"=>"08-02-21",
                "temperatura"=>"28",
                "probabilidad"=>"46.85%"
            ],
            [
                "id"=>"6",
                "fecha"=>"09-02-21",
                "temperatura"=>"19",
                "probabilidad"=>"4.21%"
            ],
            [
                "id"=>"7",
                "fecha"=>"10-02-21",
                "temperatura"=>"22",
                "probabilidad"=>"8.79%"
            ],
            [
                "id"=>"8",
                "fecha"=>"11-02-21",
                "temperatura"=>"12",
                "probabilidad"=>"0.69%"
                
            ],
            [
                "id"=>"9",
                "fecha"=>"12-02-21",
                "temperatura"=>"18",
                "probabilidad"=>"0.65%"
                
            ],
            
        ]);
    }
}
