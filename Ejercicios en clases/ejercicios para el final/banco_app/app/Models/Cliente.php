<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cliente extends Model
{
    use HasFactory;
    protected $table = 'banco_union_clientes';
    protected $fillable=[
        //campos
        "id",
        "ci",
        "nombres",
        "apellidos",
        "codigo_cliente",
    ];
}
