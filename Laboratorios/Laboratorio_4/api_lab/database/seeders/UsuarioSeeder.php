<?php

namespace Database\Seeders;

use App\Models\Usuario;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class UsuarioSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Usuario::create(["nombres"=>"mar antonio","apellidos"=>"soliz suarez","email"=>"prueba@gmail.com","password"=>"1234","rol"=>"admin"]);
    }
}
