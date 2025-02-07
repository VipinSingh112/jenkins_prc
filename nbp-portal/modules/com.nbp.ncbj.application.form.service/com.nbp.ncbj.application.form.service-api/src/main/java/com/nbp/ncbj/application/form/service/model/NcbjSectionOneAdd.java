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
 * The extended model interface for the NcbjSectionOneAdd service. Represents a row in the &quot;nbp_ncbj_section_one_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddImpl"
)
@ProviderType
public interface NcbjSectionOneAdd
	extends NcbjSectionOneAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjSectionOneAdd, Long>
		NCBJ_SECTION_ONE_ADD_ID_ACCESSOR =
			new Accessor<NcbjSectionOneAdd, Long>() {

				@Override
				public Long get(NcbjSectionOneAdd ncbjSectionOneAdd) {
					return ncbjSectionOneAdd.getNcbjSectionOneAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjSectionOneAdd> getTypeClass() {
					return NcbjSectionOneAdd.class;
				}

			};

}