/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureCropLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCropLocalService
 * @generated
 */
public class AgricultureCropLocalServiceWrapper
	implements AgricultureCropLocalService,
			   ServiceWrapper<AgricultureCropLocalService> {

	public AgricultureCropLocalServiceWrapper() {
		this(null);
	}

	public AgricultureCropLocalServiceWrapper(
		AgricultureCropLocalService agricultureCropLocalService) {

		_agricultureCropLocalService = agricultureCropLocalService;
	}

	/**
	 * Adds the agriculture crop to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureCrop the agriculture crop
	 * @return the agriculture crop that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
		addAgricultureCrop(
			com.agriculture.application.form.service.model.AgricultureCrop
				agricultureCrop) {

		return _agricultureCropLocalService.addAgricultureCrop(agricultureCrop);
	}

	/**
	 * Creates a new agriculture crop with the primary key. Does not add the agriculture crop to the database.
	 *
	 * @param agricultureCropId the primary key for the new agriculture crop
	 * @return the new agriculture crop
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
		createAgricultureCrop(long agricultureCropId) {

		return _agricultureCropLocalService.createAgricultureCrop(
			agricultureCropId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureCropLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteAgriCropById(long applicationId) {
		_agricultureCropLocalService.deleteAgriCropById(applicationId);
	}

	/**
	 * Deletes the agriculture crop from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureCrop the agriculture crop
	 * @return the agriculture crop that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
		deleteAgricultureCrop(
			com.agriculture.application.form.service.model.AgricultureCrop
				agricultureCrop) {

		return _agricultureCropLocalService.deleteAgricultureCrop(
			agricultureCrop);
	}

	/**
	 * Deletes the agriculture crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop that was removed
	 * @throws PortalException if a agriculture crop with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
			deleteAgricultureCrop(long agricultureCropId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureCropLocalService.deleteAgricultureCrop(
			agricultureCropId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureCropLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureCropLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureCropLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureCropLocalService.dynamicQuery();
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

		return _agricultureCropLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureCropModelImpl</code>.
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

		return _agricultureCropLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureCropModelImpl</code>.
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

		return _agricultureCropLocalService.dynamicQuery(
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

		return _agricultureCropLocalService.dynamicQueryCount(dynamicQuery);
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

		return _agricultureCropLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
		fetchAgricultureCrop(long agricultureCropId) {

		return _agricultureCropLocalService.fetchAgricultureCrop(
			agricultureCropId);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureCrop>
			getAC_by_AAI(long agricultureApplicationId) {

		return _agricultureCropLocalService.getAC_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureCropLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return _agricultureCropLocalService.getAgricultureById(ApplicationId);
	}

	/**
	 * Returns the agriculture crop with the primary key.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop
	 * @throws PortalException if a agriculture crop with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
			getAgricultureCrop(long agricultureCropId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureCropLocalService.getAgricultureCrop(
			agricultureCropId);
	}

	/**
	 * Returns a range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @return the range of agriculture crops
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureCrop>
			getAgricultureCrops(int start, int end) {

		return _agricultureCropLocalService.getAgricultureCrops(start, end);
	}

	/**
	 * Returns the number of agriculture crops.
	 *
	 * @return the number of agriculture crops
	 */
	@Override
	public int getAgricultureCropsCount() {
		return _agricultureCropLocalService.getAgricultureCropsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureCropLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureCropLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureCropLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the agriculture crop in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureCrop the agriculture crop
	 * @return the agriculture crop that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureCrop
		updateAgricultureCrop(
			com.agriculture.application.form.service.model.AgricultureCrop
				agricultureCrop) {

		return _agricultureCropLocalService.updateAgricultureCrop(
			agricultureCrop);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureCropLocalService.getBasePersistence();
	}

	@Override
	public AgricultureCropLocalService getWrappedService() {
		return _agricultureCropLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureCropLocalService agricultureCropLocalService) {

		_agricultureCropLocalService = agricultureCropLocalService;
	}

	private AgricultureCropLocalService _agricultureCropLocalService;

}