/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCA;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManufacturingRecommendationToJCA. This utility wraps
 * <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingRecommendationToJCALocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCALocalService
 * @generated
 */
public class ManufacturingRecommendationToJCALocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingRecommendationToJCALocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manufacturing recommendation to jca to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was added
	 */
	public static ManufacturingRecommendationToJCA
		addManufacturingRecommendationToJCA(
			ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		return getService().addManufacturingRecommendationToJCA(
			manufacturingRecommendationToJCA);
	}

	/**
	 * Creates a new manufacturing recommendation to jca with the primary key. Does not add the manufacturing recommendation to jca to the database.
	 *
	 * @param manufacturingJCAId the primary key for the new manufacturing recommendation to jca
	 * @return the new manufacturing recommendation to jca
	 */
	public static ManufacturingRecommendationToJCA
		createManufacturingRecommendationToJCA(long manufacturingJCAId) {

		return getService().createManufacturingRecommendationToJCA(
			manufacturingJCAId);
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
	 * Deletes the manufacturing recommendation to jca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 * @throws PortalException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public static ManufacturingRecommendationToJCA
			deleteManufacturingRecommendationToJCA(long manufacturingJCAId)
		throws PortalException {

		return getService().deleteManufacturingRecommendationToJCA(
			manufacturingJCAId);
	}

	/**
	 * Deletes the manufacturing recommendation to jca from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 */
	public static ManufacturingRecommendationToJCA
		deleteManufacturingRecommendationToJCA(
			ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		return getService().deleteManufacturingRecommendationToJCA(
			manufacturingRecommendationToJCA);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAModelImpl</code>.
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

	public static ManufacturingRecommendationToJCA
		fetchManufacturingRecommendationToJCA(long manufacturingJCAId) {

		return getService().fetchManufacturingRecommendationToJCA(
			manufacturingJCAId);
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

	/**
	 * Returns the manufacturing recommendation to jca with the primary key.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca
	 * @throws PortalException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public static ManufacturingRecommendationToJCA
			getManufacturingRecommendationToJCA(long manufacturingJCAId)
		throws PortalException {

		return getService().getManufacturingRecommendationToJCA(
			manufacturingJCAId);
	}

	public static ManufacturingRecommendationToJCA
			getManufacturingRecommendationToJCA(String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingRecommendationToJCAException {

		return getService().getManufacturingRecommendationToJCA(caseId);
	}

	/**
	 * Returns a range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @return the range of manufacturing recommendation to jcas
	 */
	public static List<ManufacturingRecommendationToJCA>
		getManufacturingRecommendationToJCAs(int start, int end) {

		return getService().getManufacturingRecommendationToJCAs(start, end);
	}

	/**
	 * Returns the number of manufacturing recommendation to jcas.
	 *
	 * @return the number of manufacturing recommendation to jcas
	 */
	public static int getManufacturingRecommendationToJCAsCount() {
		return getService().getManufacturingRecommendationToJCAsCount();
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
	 * Updates the manufacturing recommendation to jca in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingRecommendationToJCALocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was updated
	 */
	public static ManufacturingRecommendationToJCA
		updateManufacturingRecommendationToJCA(
			ManufacturingRecommendationToJCA manufacturingRecommendationToJCA) {

		return getService().updateManufacturingRecommendationToJCA(
			manufacturingRecommendationToJCA);
	}

	public static ManufacturingRecommendationToJCA
		updateManufacturingRecommendationToJCA(
			String caseId, java.util.Date date, String recommendationToJCA,
			String recommendation, String numberOfMiicInspector) {

		return getService().updateManufacturingRecommendationToJCA(
			caseId, date, recommendationToJCA, recommendation,
			numberOfMiicInspector);
	}

	public static ManufacturingRecommendationToJCALocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManufacturingRecommendationToJCALocalService>
		_serviceSnapshot = new Snapshot<>(
			ManufacturingRecommendationToJCALocalServiceUtil.class,
			ManufacturingRecommendationToJCALocalService.class);

}