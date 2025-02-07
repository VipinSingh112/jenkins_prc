/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncra_veri_weigh_date&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDate
 * @generated
 */
public class NcraVerifyWeighingDateTable
	extends BaseTable<NcraVerifyWeighingDateTable> {

	public static final NcraVerifyWeighingDateTable INSTANCE =
		new NcraVerifyWeighingDateTable();

	public final Column<NcraVerifyWeighingDateTable, Long>
		ncraVerifyWeighingDateId = createColumn(
			"ncraVerifyWeighingDateId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcraVerifyWeighingDateTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDateTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDateTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDateTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDateTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDateTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDateTable, Date> weighingDate =
		createColumn(
			"weighingDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraVerifyWeighingDateTable, Long> ncraApplicationId =
		createColumn(
			"ncraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcraVerifyWeighingDateTable() {
		super("nbp_ncra_veri_weigh_date", NcraVerifyWeighingDateTable::new);
	}

}