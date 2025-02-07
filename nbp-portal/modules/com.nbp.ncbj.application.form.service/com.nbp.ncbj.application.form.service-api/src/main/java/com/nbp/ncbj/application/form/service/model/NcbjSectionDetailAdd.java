/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjSectionDetailAdd service. Represents a row in the &quot;nbp_ncbj_section_detail&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddImpl"
)
@ProviderType
public interface NcbjSectionDetailAdd
	extends NcbjSectionDetailAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjSectionDetailAdd, Long>
		NCBJ_SECTION_DETAIL_ADD_ID_ACCESSOR =
			new Accessor<NcbjSectionDetailAdd, Long>() {

				@Override
				public Long get(NcbjSectionDetailAdd ncbjSectionDetailAdd) {
					return ncbjSectionDetailAdd.getNcbjSectionDetailAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjSectionDetailAdd> getTypeClass() {
					return NcbjSectionDetailAdd.class;
				}

			};

}