/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.agriculture.application.form.service.model.AgricultureAquaculture;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AgricultureAquaculture. This utility wraps
 * <code>com.agriculture.application.form.service.service.impl.AgricultureAquacultureLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquacultureLocalService
 * @generated
 */
public class AgricultureAquacultureLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.agriculture.application.form.service.service.impl.AgricultureAquacultureLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the agriculture aquaculture to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was added
	 */
	public static AgricultureAquaculture addAgricultureAquaculture(
		AgricultureAquaculture agricultureAquaculture) {

		return getService().addAgricultureAquaculture(agricultureAquaculture);
	}

	/**
	 * Creates a new agriculture aquaculture with the primary key. Does not add the agriculture aquaculture to the database.
	 *
	 * @param agricultureAquacultureId the primary key for the new agriculture aquaculture
	 * @return the new agriculture aquaculture
	 */
	public static AgricultureAquaculture createAgricultureAquaculture(
		long agricultureAquacultureId) {

		return getService().createAgricultureAquaculture(
			agricultureAquacultureId);
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
	 * Deletes the agriculture aquaculture from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 */
	public static AgricultureAquaculture deleteAgricultureAquaculture(
		AgricultureAquaculture agricultureAquaculture) {

		return getService().deleteAgricultureAquaculture(
			agricultureAquaculture);
	}

	/**
	 * Deletes the agriculture aquaculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 * @throws PortalException if a agriculture aquaculture with the primary key could not be found
	 */
	public static AgricultureAquaculture deleteAgricultureAquaculture(
			long agricultureAquacultureId)
		throws PortalException {

		return getService().deleteAgricultureAquaculture(
			agricultureAquacultureId);
	}

	public static void deleteAquaById(long applicationId) {
		getService().deleteAquaById(applicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
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

	public static AgricultureAquaculture fetchAgricultureAquaculture(
		long agricultureAquacultureId) {

		return getService().fetchAgricultureAquaculture(
			agricultureAquacultureId);
	}

	public static List<AgricultureAquaculture> getAAqa_by_AAI(
		long agricultureApplicationId) {

		return getService().getAAqa_by_AAI(agricultureApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the agriculture aquaculture with the primary key.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture
	 * @throws PortalException if a agriculture aquaculture with the primary key could not be found
	 */
	public static AgricultureAquaculture getAgricultureAquaculture(
			long agricultureAquacultureId)
		throws PortalException {

		return getService().getAgricultureAquaculture(agricultureAquacultureId);
	}

	/**
	 * Returns a range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> getAgricultureAquacultures(
		int start, int end) {

		return getService().getAgricultureAquacultures(start, end);
	}

	/**
	 * Returns the number of agriculture aquacultures.
	 *
	 * @return the number of agriculture aquacultures
	 */
	public static int getAgricultureAquaculturesCount() {
		return getService().getAgricultureAquaculturesCount();
	}

	public static AgricultureAquaculture getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getService().getAgricultureById(ApplicationId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
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
	 * Updates the agriculture aquaculture in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was updated
	 */
	public static AgricultureAquaculture updateAgricultureAquaculture(
		AgricultureAquaculture agricultureAquaculture) {

		return getService().updateAgricultureAquaculture(
			agricultureAquaculture);
	}

	public static AgricultureAquacultureLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AgricultureAquacultureLocalService>
		_serviceSnapshot = new Snapshot<>(
			AgricultureAquacultureLocalServiceUtil.class,
			AgricultureAquacultureLocalService.class);

}