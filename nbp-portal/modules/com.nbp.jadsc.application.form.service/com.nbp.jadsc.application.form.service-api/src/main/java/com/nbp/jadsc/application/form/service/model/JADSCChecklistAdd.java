/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JADSCChecklistAdd service. Represents a row in the &quot;nbp_jadsc_checklist_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddImpl"
)
@ProviderType
public interface JADSCChecklistAdd
	extends JADSCChecklistAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JADSCChecklistAdd, Long>
		J_ADSC_CHECKLIST_ADD_ID_ACCESSOR =
			new Accessor<JADSCChecklistAdd, Long>() {

				@Override
				public Long get(JADSCChecklistAdd jadscChecklistAdd) {
					return jadscChecklistAdd.getJADSCChecklistAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JADSCChecklistAdd> getTypeClass() {
					return JADSCChecklistAdd.class;
				}

			};

}