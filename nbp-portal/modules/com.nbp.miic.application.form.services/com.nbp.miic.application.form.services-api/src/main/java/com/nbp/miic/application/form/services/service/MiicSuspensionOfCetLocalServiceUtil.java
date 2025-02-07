/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiicSuspensionOfCet. This utility wraps
 * <code>com.nbp.miic.application.form.services.service.impl.MiicSuspensionOfCetLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetLocalService
 * @generated
 */
public class MiicSuspensionOfCetLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.miic.application.form.services.service.impl.MiicSuspensionOfCetLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the miic suspension of cet to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 * @return the miic suspension of cet that was added
	 */
	public static MiicSuspensionOfCet addMiicSuspensionOfCet(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		return getService().addMiicSuspensionOfCet(miicSuspensionOfCet);
	}

	/**
	 * Creates a new miic suspension of cet with the primary key. Does not add the miic suspension of cet to the database.
	 *
	 * @param miicSuspensionOfCetId the primary key for the new miic suspension of cet
	 * @return the new miic suspension of cet
	 */
	public static MiicSuspensionOfCet createMiicSuspensionOfCet(
		long miicSuspensionOfCetId) {

		return getService().createMiicSuspensionOfCet(miicSuspensionOfCetId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the miic suspension of cet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 * @throws PortalException if a miic suspension of cet with the primary key could not be found
	 */
	public static MiicSuspensionOfCet deleteMiicSuspensionOfCet(
			long miicSuspensionOfCetId)
		throws PortalException {

		return getService().deleteMiicSuspensionOfCet(miicSuspensionOfCetId);
	}

	/**
	 * Deletes the miic suspension of cet from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 * @return the miic suspension of cet that was removed
	 */
	public static MiicSuspensionOfCet deleteMiicSuspensionOfCet(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		return getService().deleteMiicSuspensionOfCet(miicSuspensionOfCet);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static MiicSuspensionOfCet fetchMiicSuspensionOfCet(
		long miicSuspensionOfCetId) {

		return getService().fetchMiicSuspensionOfCet(miicSuspensionOfCetId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static MiicSuspensionOfCet getMiicById(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetException {

		return getService().getMiicById(miicApplicationId);
	}

	/**
	 * Returns the miic suspension of cet with the primary key.
	 *
	 * @param miicSuspensionOfCetId the primary key of the miic suspension of cet
	 * @return the miic suspension of cet
	 * @throws PortalException if a miic suspension of cet with the primary key could not be found
	 */
	public static MiicSuspensionOfCet getMiicSuspensionOfCet(
			long miicSuspensionOfCetId)
		throws PortalException {

		return getService().getMiicSuspensionOfCet(miicSuspensionOfCetId);
	}

	/**
	 * Returns a range of all the miic suspension of cets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cets
	 * @param end the upper bound of the range of miic suspension of cets (not inclusive)
	 * @return the range of miic suspension of cets
	 */
	public static List<MiicSuspensionOfCet> getMiicSuspensionOfCets(
		int start, int end) {

		return getService().getMiicSuspensionOfCets(start, end);
	}

	/**
	 * Returns the number of miic suspension of cets.
	 *
	 * @return the number of miic suspension of cets
	 */
	public static int getMiicSuspensionOfCetsCount() {
		return getService().getMiicSuspensionOfCetsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the miic suspension of cet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSuspensionOfCetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSuspensionOfCet the miic suspension of cet
	 * @return the miic suspension of cet that was updated
	 */
	public static MiicSuspensionOfCet updateMiicSuspensionOfCet(
		MiicSuspensionOfCet miicSuspensionOfCet) {

		return getService().updateMiicSuspensionOfCet(miicSuspensionOfCet);
	}

	public static MiicSuspensionOfCetLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiicSuspensionOfCetLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiicSuspensionOfCetLocalServiceUtil.class,
			MiicSuspensionOfCetLocalService.class);

}