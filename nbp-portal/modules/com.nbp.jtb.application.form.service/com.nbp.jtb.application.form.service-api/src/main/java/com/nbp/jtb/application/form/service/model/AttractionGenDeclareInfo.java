/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AttractionGenDeclareInfo service. Represents a row in the &quot;nbp_jtb_attract_gen_dec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoImpl"
)
@ProviderType
public interface AttractionGenDeclareInfo
	extends AttractionGenDeclareInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AttractionGenDeclareInfo, Long>
		ATTRACTION_GEN_DECLARE_INFO_ID_ACCESSOR =
			new Accessor<AttractionGenDeclareInfo, Long>() {

				@Override
				public Long get(
					AttractionGenDeclareInfo attractionGenDeclareInfo) {

					return attractionGenDeclareInfo.
						getAttractionGenDeclareInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AttractionGenDeclareInfo> getTypeClass() {
					return AttractionGenDeclareInfo.class;
				}

			};

}