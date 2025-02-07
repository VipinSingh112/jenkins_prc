/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OSIServicesRecommendationsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendationsLocalService
 * @generated
 */
public class OSIServicesRecommendationsLocalServiceWrapper
	implements OSIServicesRecommendationsLocalService,
			   ServiceWrapper<OSIServicesRecommendationsLocalService> {

	public OSIServicesRecommendationsLocalServiceWrapper() {
		this(null);
	}

	public OSIServicesRecommendationsLocalServiceWrapper(
		OSIServicesRecommendationsLocalService
			osiServicesRecommendationsLocalService) {

		_osiServicesRecommendationsLocalService =
			osiServicesRecommendationsLocalService;
	}

	/**
	 * Adds the osi services recommendations to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesRecommendationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesRecommendations the osi services recommendations
	 * @return the osi services recommendations that was added
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
		addOSIServicesRecommendations(
			com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
				osiServicesRecommendations) {

		return _osiServicesRecommendationsLocalService.
			addOSIServicesRecommendations(osiServicesRecommendations);
	}

	/**
	 * Creates a new osi services recommendations with the primary key. Does not add the osi services recommendations to the database.
	 *
	 * @param oSIServicesRecommendationsId the primary key for the new osi services recommendations
	 * @return the new osi services recommendations
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
		createOSIServicesRecommendations(long oSIServicesRecommendationsId) {

		return _osiServicesRecommendationsLocalService.
			createOSIServicesRecommendations(oSIServicesRecommendationsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesRecommendationsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services recommendations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesRecommendationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations that was removed
	 * @throws PortalException if a osi services recommendations with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
			deleteOSIServicesRecommendations(long oSIServicesRecommendationsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesRecommendationsLocalService.
			deleteOSIServicesRecommendations(oSIServicesRecommendationsId);
	}

	/**
	 * Deletes the osi services recommendations from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesRecommendationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesRecommendations the osi services recommendations
	 * @return the osi services recommendations that was removed
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
		deleteOSIServicesRecommendations(
			com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
				osiServicesRecommendations) {

		return _osiServicesRecommendationsLocalService.
			deleteOSIServicesRecommendations(osiServicesRecommendations);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesRecommendationsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesRecommendationsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesRecommendationsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesRecommendationsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiServicesRecommendationsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _osiServicesRecommendationsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _osiServicesRecommendationsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiServicesRecommendationsLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _osiServicesRecommendationsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
		fetchOSIServicesRecommendations(long oSIServicesRecommendationsId) {

		return _osiServicesRecommendationsLocalService.
			fetchOSIServicesRecommendations(oSIServicesRecommendationsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesRecommendationsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesRecommendationsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesRecommendationsLocalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
			getOsiServicesRecommendationByCaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesRecommendationsException {

		return _osiServicesRecommendationsLocalService.
			getOsiServicesRecommendationByCaseId(caseId);
	}

	/**
	 * Returns the osi services recommendations with the primary key.
	 *
	 * @param oSIServicesRecommendationsId the primary key of the osi services recommendations
	 * @return the osi services recommendations
	 * @throws PortalException if a osi services recommendations with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
			getOSIServicesRecommendations(long oSIServicesRecommendationsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesRecommendationsLocalService.
			getOSIServicesRecommendations(oSIServicesRecommendationsId);
	}

	/**
	 * Returns a range of all the osi services recommendationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesRecommendationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services recommendationses
	 * @param end the upper bound of the range of osi services recommendationses (not inclusive)
	 * @return the range of osi services recommendationses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesRecommendations>
			getOSIServicesRecommendationses(int start, int end) {

		return _osiServicesRecommendationsLocalService.
			getOSIServicesRecommendationses(start, end);
	}

	/**
	 * Returns the number of osi services recommendationses.
	 *
	 * @return the number of osi services recommendationses
	 */
	@Override
	public int getOSIServicesRecommendationsesCount() {
		return _osiServicesRecommendationsLocalService.
			getOSIServicesRecommendationsesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesRecommendationsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services recommendations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesRecommendationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesRecommendations the osi services recommendations
	 * @return the osi services recommendations that was updated
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
		updateOSIServicesRecommendations(
			com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
				osiServicesRecommendations) {

		return _osiServicesRecommendationsLocalService.
			updateOSIServicesRecommendations(osiServicesRecommendations);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
		updateOSIServicesRecommendations(
			String caseId, java.util.Date dateOfRecommendationsDecision,
			String recommendationsDecision) {

		return _osiServicesRecommendationsLocalService.
			updateOSIServicesRecommendations(
				caseId, dateOfRecommendationsDecision, recommendationsDecision);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesRecommendations
		updateOSIServicesRecommendations(String caseId, String decision) {

		return _osiServicesRecommendationsLocalService.
			updateOSIServicesRecommendations(caseId, decision);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesRecommendationsLocalService.getBasePersistence();
	}

	@Override
	public OSIServicesRecommendationsLocalService getWrappedService() {
		return _osiServicesRecommendationsLocalService;
	}

	@Override
	public void setWrappedService(
		OSIServicesRecommendationsLocalService
			osiServicesRecommendationsLocalService) {

		_osiServicesRecommendationsLocalService =
			osiServicesRecommendationsLocalService;
	}

	private OSIServicesRecommendationsLocalService
		_osiServicesRecommendationsLocalService;

}