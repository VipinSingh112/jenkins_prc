/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;nbp_cannabis_fee_master&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisFeeMaster
 * @generated
 */
public class CannabisFeeMasterTable extends BaseTable<CannabisFeeMasterTable> {

	public static final CannabisFeeMasterTable INSTANCE =
		new CannabisFeeMasterTable();

	public final Column<CannabisFeeMasterTable, Long> cannabisFeeMasterId =
		createColumn(
			"cannabisFeeMasterId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisFeeMasterTable, String> category = createColumn(
		"category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisFeeMasterTable, String> subCategory =
		createColumn(
			"subCategory", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisFeeMasterTable, Double> securityBond =
		createColumn(
			"securityBond", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<CannabisFeeMasterTable, Double> licenseFee =
		createColumn(
			"licenseFee", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<CannabisFeeMasterTable, String> remarks = createColumn(
		"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CannabisFeeMasterTable() {
		super("nbp_cannabis_fee_master", CannabisFeeMasterTable::new);
	}

}