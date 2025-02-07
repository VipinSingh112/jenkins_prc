/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacture_packaging_pro&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PackagingProcess
 * @generated
 */
public class PackagingProcessTable extends BaseTable<PackagingProcessTable> {

	public static final PackagingProcessTable INSTANCE =
		new PackagingProcessTable();

	public final Column<PackagingProcessTable, Long> packagingProcessId =
		createColumn(
			"packagingProcessId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PackagingProcessTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PackagingProcessTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PackagingProcessTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PackagingProcessTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PackagingProcessTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PackagingProcessTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PackagingProcessTable, String> packagingProcess =
		createColumn(
			"packagingProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PackagingProcessTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PackagingProcessTable() {
		super("nbp_manufacture_packaging_pro", PackagingProcessTable::new);
	}

}