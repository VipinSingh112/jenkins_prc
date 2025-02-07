/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadiationSafetyLowRiskLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyLowRiskLocalService
 * @generated
 */
public class RadiationSafetyLowRiskLocalServiceWrapper
	implements RadiationSafetyLowRiskLocalService,
			   ServiceWrapper<RadiationSafetyLowRiskLocalService> {

	public RadiationSafetyLowRiskLocalServiceWrapper() {
		this(null);
	}

	public RadiationSafetyLowRiskLocalServiceWrapper(
		RadiationSafetyLowRiskLocalService radiationSafetyLowRiskLocalService) {

		_radiationSafetyLowRiskLocalService =
			radiationSafetyLowRiskLocalService;
	}

	/**
	 * Adds the radiation safety low risk to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
		addRadiationSafetyLowRisk(
			com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
				radiationSafetyLowRisk) {

		return _radiationSafetyLowRiskLocalService.addRadiationSafetyLowRisk(
			radiationSafetyLowRisk);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyLowRiskLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new radiation safety low risk with the primary key. Does not add the radiation safety low risk to the database.
	 *
	 * @param radiationSafetyLowRiskId the primary key for the new radiation safety low risk
	 * @return the new radiation safety low risk
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
		createRadiationSafetyLowRisk(long radiationSafetyLowRiskId) {

		return _radiationSafetyLowRiskLocalService.createRadiationSafetyLowRisk(
			radiationSafetyLowRiskId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyLowRiskLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radiation safety low risk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 * @throws PortalException if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
			deleteRadiationSafetyLowRisk(long radiationSafetyLowRiskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyLowRiskLocalService.deleteRadiationSafetyLowRisk(
			radiationSafetyLowRiskId);
	}

	/**
	 * Deletes the radiation safety low risk from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
		deleteRadiationSafetyLowRisk(
			com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
				radiationSafetyLowRisk) {

		return _radiationSafetyLowRiskLocalService.deleteRadiationSafetyLowRisk(
			radiationSafetyLowRisk);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radiationSafetyLowRiskLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radiationSafetyLowRiskLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radiationSafetyLowRiskLocalService.dynamicQuery();
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

		return _radiationSafetyLowRiskLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
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

		return _radiationSafetyLowRiskLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
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

		return _radiationSafetyLowRiskLocalService.dynamicQuery(
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

		return _radiationSafetyLowRiskLocalService.dynamicQueryCount(
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

		return _radiationSafetyLowRiskLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
		fetchRadiationSafetyLowRisk(long radiationSafetyLowRiskId) {

		return _radiationSafetyLowRiskLocalService.fetchRadiationSafetyLowRisk(
			radiationSafetyLowRiskId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radiationSafetyLowRiskLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyLowRiskException {

		return _radiationSafetyLowRiskLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radiationSafetyLowRiskLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationSafetyLowRiskLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyLowRiskLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the radiation safety low risk with the primary key.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk
	 * @throws PortalException if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
			getRadiationSafetyLowRisk(long radiationSafetyLowRiskId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyLowRiskLocalService.getRadiationSafetyLowRisk(
			radiationSafetyLowRiskId);
	}

	/**
	 * Returns a range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @return the range of radiation safety low risks
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadiationSafetyLowRisk>
			getRadiationSafetyLowRisks(int start, int end) {

		return _radiationSafetyLowRiskLocalService.getRadiationSafetyLowRisks(
			start, end);
	}

	/**
	 * Returns the number of radiation safety low risks.
	 *
	 * @return the number of radiation safety low risks
	 */
	@Override
	public int getRadiationSafetyLowRisksCount() {
		return _radiationSafetyLowRiskLocalService.
			getRadiationSafetyLowRisksCount();
	}

	/**
	 * Updates the radiation safety low risk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
		updateRadiationSafetyLowRisk(
			com.nbp.hsra.application.service.model.RadiationSafetyLowRisk
				radiationSafetyLowRisk) {

		return _radiationSafetyLowRiskLocalService.updateRadiationSafetyLowRisk(
			radiationSafetyLowRisk);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radiationSafetyLowRiskLocalService.getBasePersistence();
	}

	@Override
	public RadiationSafetyLowRiskLocalService getWrappedService() {
		return _radiationSafetyLowRiskLocalService;
	}

	@Override
	public void setWrappedService(
		RadiationSafetyLowRiskLocalService radiationSafetyLowRiskLocalService) {

		_radiationSafetyLowRiskLocalService =
			radiationSafetyLowRiskLocalService;
	}

	private RadiationSafetyLowRiskLocalService
		_radiationSafetyLowRiskLocalService;

}