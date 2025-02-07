/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;nbp_pharma_sub_categories&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaSubCategoriesMapping
 * @generated
 */
public class PharmaSubCategoriesMappingTable
	extends BaseTable<PharmaSubCategoriesMappingTable> {

	public static final PharmaSubCategoriesMappingTable INSTANCE =
		new PharmaSubCategoriesMappingTable();

	public final Column<PharmaSubCategoriesMappingTable, Long>
		pharmaSubCategoriesMappingId = createColumn(
			"pharmaSubCategoriesMappingId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaSubCategoriesMappingTable, String>
		pharmaSubCategory = createColumn(
			"pharmaSubCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaSubCategoriesMappingTable, String>
		pharmaSubCategoryMapValue = createColumn(
			"pharmaSubCategoryMapValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private PharmaSubCategoriesMappingTable() {
		super(
			"nbp_pharma_sub_categories", PharmaSubCategoriesMappingTable::new);
	}

}