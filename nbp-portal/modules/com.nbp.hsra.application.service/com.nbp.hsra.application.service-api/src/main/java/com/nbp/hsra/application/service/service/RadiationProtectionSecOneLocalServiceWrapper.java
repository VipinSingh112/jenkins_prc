/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadiationProtectionSecOneLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationProtectionSecOneLocalService
 * @generated
 */
public class RadiationProtectionSecOneLocalServiceWrapper
	implements RadiationProtectionSecOneLocalService,
			   ServiceWrapper<RadiationProtectionSecOneLocalService> {

	public RadiationProtectionSecOneLocalServiceWrapper() {
		this(null);
	}

	public RadiationProtectionSecOneLocalServiceWrapper(
		RadiationProtectionSecOneLocalService
			radiationProtectionSecOneLocalService) {

		_radiationProtectionSecOneLocalService =
			radiationProtectionSecOneLocalService;
	}

	/**
	 * Adds the radiation protection sec one to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationProtectionSecOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationProtectionSecOne the radiation protection sec one
	 * @return the radiation protection sec one that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
		addRadiationProtectionSecOne(
			com.nbp.hsra.application.service.model.RadiationProtectionSecOne
				radiationProtectionSecOne) {

		return _radiationProtectionSecOneLocalService.
			addRadiationProtectionSecOne(radiationProtectionSecOne);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationProtectionSecOneLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new radiation protection sec one with the primary key. Does not add the radiation protection sec one to the database.
	 *
	 * @param radiationProtectSecOneId the primary key for the new radiation protection sec one
	 * @return the new radiation protection sec one
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
		createRadiationProtectionSecOne(long radiationProtectSecOneId) {

		return _radiationProtectionSecOneLocalService.
			createRadiationProtectionSecOne(radiationProtectSecOneId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationProtectionSecOneLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radiation protection sec one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationProtectionSecOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one that was removed
	 * @throws PortalException if a radiation protection sec one with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
			deleteRadiationProtectionSecOne(long radiationProtectSecOneId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationProtectionSecOneLocalService.
			deleteRadiationProtectionSecOne(radiationProtectSecOneId);
	}

	/**
	 * Deletes the radiation protection sec one from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationProtectionSecOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationProtectionSecOne the radiation protection sec one
	 * @return the radiation protection sec one that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
		deleteRadiationProtectionSecOne(
			com.nbp.hsra.application.service.model.RadiationProtectionSecOne
				radiationProtectionSecOne) {

		return _radiationProtectionSecOneLocalService.
			deleteRadiationProtectionSecOne(radiationProtectionSecOne);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radiationProtectionSecOneLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radiationProtectionSecOneLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radiationProtectionSecOneLocalService.dynamicQuery();
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

		return _radiationProtectionSecOneLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneModelImpl</code>.
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

		return _radiationProtectionSecOneLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneModelImpl</code>.
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

		return _radiationProtectionSecOneLocalService.dynamicQuery(
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

		return _radiationProtectionSecOneLocalService.dynamicQueryCount(
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

		return _radiationProtectionSecOneLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
		fetchRadiationProtectionSecOne(long radiationProtectSecOneId) {

		return _radiationProtectionSecOneLocalService.
			fetchRadiationProtectionSecOne(radiationProtectSecOneId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radiationProtectionSecOneLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationProtectionSecOneException {

		return _radiationProtectionSecOneLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radiationProtectionSecOneLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationProtectionSecOneLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationProtectionSecOneLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the radiation protection sec one with the primary key.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one
	 * @throws PortalException if a radiation protection sec one with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
			getRadiationProtectionSecOne(long radiationProtectSecOneId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationProtectionSecOneLocalService.
			getRadiationProtectionSecOne(radiationProtectSecOneId);
	}

	/**
	 * Returns a range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @return the range of radiation protection sec ones
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadiationProtectionSecOne>
			getRadiationProtectionSecOnes(int start, int end) {

		return _radiationProtectionSecOneLocalService.
			getRadiationProtectionSecOnes(start, end);
	}

	/**
	 * Returns the number of radiation protection sec ones.
	 *
	 * @return the number of radiation protection sec ones
	 */
	@Override
	public int getRadiationProtectionSecOnesCount() {
		return _radiationProtectionSecOneLocalService.
			getRadiationProtectionSecOnesCount();
	}

	/**
	 * Updates the radiation protection sec one in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationProtectionSecOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationProtectionSecOne the radiation protection sec one
	 * @return the radiation protection sec one that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationProtectionSecOne
		updateRadiationProtectionSecOne(
			com.nbp.hsra.application.service.model.RadiationProtectionSecOne
				radiationProtectionSecOne) {

		return _radiationProtectionSecOneLocalService.
			updateRadiationProtectionSecOne(radiationProtectionSecOne);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radiationProtectionSecOneLocalService.getBasePersistence();
	}

	@Override
	public RadiationProtectionSecOneLocalService getWrappedService() {
		return _radiationProtectionSecOneLocalService;
	}

	@Override
	public void setWrappedService(
		RadiationProtectionSecOneLocalService
			radiationProtectionSecOneLocalService) {

		_radiationProtectionSecOneLocalService =
			radiationProtectionSecOneLocalService;
	}

	private RadiationProtectionSecOneLocalService
		_radiationProtectionSecOneLocalService;

}