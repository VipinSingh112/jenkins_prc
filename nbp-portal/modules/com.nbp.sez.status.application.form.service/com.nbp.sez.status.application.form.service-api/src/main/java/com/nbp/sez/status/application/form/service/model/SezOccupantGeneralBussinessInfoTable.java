/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_occ_gen_bussiness&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessInfo
 * @generated
 */
public class SezOccupantGeneralBussinessInfoTable
	extends BaseTable<SezOccupantGeneralBussinessInfoTable> {

	public static final SezOccupantGeneralBussinessInfoTable INSTANCE =
		new SezOccupantGeneralBussinessInfoTable();

	public final Column<SezOccupantGeneralBussinessInfoTable, Long>
		sezOccGenBussId = createColumn(
			"sezOccGenBussId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantGeneralBussinessInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, Date> occAppDate =
		createColumn(
			"occAppDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String>
		occSezDevName = createColumn(
			"occSezDevName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String>
		occSezDevControlNum = createColumn(
			"occSezDevControlNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String>
		occExistingCom = createColumn(
			"occExistingCom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String>
		occFormArticle = createColumn(
			"occFormArticle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String>
		occFormArticleOther = createColumn(
			"occFormArticleOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String> occTRN =
		createColumn(
			"occTRN", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String> occGCT =
		createColumn(
			"occGCT", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, String> occTCC =
		createColumn(
			"occTCC", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantGeneralBussinessInfoTable() {
		super(
			"nbp_sez_occ_gen_bussiness",
			SezOccupantGeneralBussinessInfoTable::new);
	}

}