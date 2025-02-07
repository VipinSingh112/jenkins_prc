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
 * The extended model interface for the JADSCChecklist service. Represents a row in the &quot;nbp_jadsc_checklist_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistImpl"
)
@ProviderType
public interface JADSCChecklist extends JADSCChecklistModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JADSCChecklist, Long>
		JADSC_CHECKLIST_ID_ACCESSOR = new Accessor<JADSCChecklist, Long>() {

			@Override
			public Long get(JADSCChecklist jadscChecklist) {
				return jadscChecklist.getJadscChecklistId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<JADSCChecklist> getTypeClass() {
				return JADSCChecklist.class;
			}

		};

}