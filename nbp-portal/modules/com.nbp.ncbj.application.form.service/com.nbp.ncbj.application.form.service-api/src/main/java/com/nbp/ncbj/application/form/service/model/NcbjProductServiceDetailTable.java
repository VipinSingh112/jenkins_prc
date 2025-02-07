/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_product_service&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjProductServiceDetail
 * @generated
 */
public class NcbjProductServiceDetailTable
	extends BaseTable<NcbjProductServiceDetailTable> {

	public static final NcbjProductServiceDetailTable INSTANCE =
		new NcbjProductServiceDetailTable();

	public final Column<NcbjProductServiceDetailTable, Long>
		ncbjProductServiceDetailId = createColumn(
			"ncbjProductServiceDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjProductServiceDetailTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, String> productType =
		createColumn(
			"productType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, String> productList =
		createColumn(
			"productList", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, String> productLines =
		createColumn(
			"productLines", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjProductServiceDetailTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjProductServiceDetailTable() {
		super("nbp_ncbj_product_service", NcbjProductServiceDetailTable::new);
	}

}