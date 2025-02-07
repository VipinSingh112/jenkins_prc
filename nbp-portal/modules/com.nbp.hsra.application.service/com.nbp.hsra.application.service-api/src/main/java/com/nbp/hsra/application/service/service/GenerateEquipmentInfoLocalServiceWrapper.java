/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link GenerateEquipmentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GenerateEquipmentInfoLocalService
 * @generated
 */
public class GenerateEquipmentInfoLocalServiceWrapper
	implements GenerateEquipmentInfoLocalService,
			   ServiceWrapper<GenerateEquipmentInfoLocalService> {

	public GenerateEquipmentInfoLocalServiceWrapper() {
		this(null);
	}

	public GenerateEquipmentInfoLocalServiceWrapper(
		GenerateEquipmentInfoLocalService generateEquipmentInfoLocalService) {

		_generateEquipmentInfoLocalService = generateEquipmentInfoLocalService;
	}

	/**
	 * Adds the generate equipment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenerateEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generateEquipmentInfo the generate equipment info
	 * @return the generate equipment info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
		addGenerateEquipmentInfo(
			com.nbp.hsra.application.service.model.GenerateEquipmentInfo
				generateEquipmentInfo) {

		return _generateEquipmentInfoLocalService.addGenerateEquipmentInfo(
			generateEquipmentInfo);
	}

	/**
	 * Creates a new generate equipment info with the primary key. Does not add the generate equipment info to the database.
	 *
	 * @param GenerateEquipmentInfoId the primary key for the new generate equipment info
	 * @return the new generate equipment info
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
		createGenerateEquipmentInfo(long GenerateEquipmentInfoId) {

		return _generateEquipmentInfoLocalService.createGenerateEquipmentInfo(
			GenerateEquipmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generateEquipmentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the generate equipment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenerateEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generateEquipmentInfo the generate equipment info
	 * @return the generate equipment info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
		deleteGenerateEquipmentInfo(
			com.nbp.hsra.application.service.model.GenerateEquipmentInfo
				generateEquipmentInfo) {

		return _generateEquipmentInfoLocalService.deleteGenerateEquipmentInfo(
			generateEquipmentInfo);
	}

	/**
	 * Deletes the generate equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenerateEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info that was removed
	 * @throws PortalException if a generate equipment info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
			deleteGenerateEquipmentInfo(long GenerateEquipmentInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generateEquipmentInfoLocalService.deleteGenerateEquipmentInfo(
			GenerateEquipmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generateEquipmentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _generateEquipmentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _generateEquipmentInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _generateEquipmentInfoLocalService.dynamicQuery();
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

		return _generateEquipmentInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.GenerateEquipmentInfoModelImpl</code>.
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

		return _generateEquipmentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.GenerateEquipmentInfoModelImpl</code>.
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

		return _generateEquipmentInfoLocalService.dynamicQuery(
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

		return _generateEquipmentInfoLocalService.dynamicQueryCount(
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

		return _generateEquipmentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
		fetchGenerateEquipmentInfo(long GenerateEquipmentInfoId) {

		return _generateEquipmentInfoLocalService.fetchGenerateEquipmentInfo(
			GenerateEquipmentInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _generateEquipmentInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the generate equipment info with the primary key.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info
	 * @throws PortalException if a generate equipment info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
			getGenerateEquipmentInfo(long GenerateEquipmentInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generateEquipmentInfoLocalService.getGenerateEquipmentInfo(
			GenerateEquipmentInfoId);
	}

	/**
	 * Returns a range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @return the range of generate equipment infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.GenerateEquipmentInfo>
			getGenerateEquipmentInfos(int start, int end) {

		return _generateEquipmentInfoLocalService.getGenerateEquipmentInfos(
			start, end);
	}

	/**
	 * Returns the number of generate equipment infos.
	 *
	 * @return the number of generate equipment infos
	 */
	@Override
	public int getGenerateEquipmentInfosCount() {
		return _generateEquipmentInfoLocalService.
			getGenerateEquipmentInfosCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenerateEquipmentInfoException {

		return _generateEquipmentInfoLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _generateEquipmentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _generateEquipmentInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _generateEquipmentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the generate equipment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenerateEquipmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generateEquipmentInfo the generate equipment info
	 * @return the generate equipment info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenerateEquipmentInfo
		updateGenerateEquipmentInfo(
			com.nbp.hsra.application.service.model.GenerateEquipmentInfo
				generateEquipmentInfo) {

		return _generateEquipmentInfoLocalService.updateGenerateEquipmentInfo(
			generateEquipmentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _generateEquipmentInfoLocalService.getBasePersistence();
	}

	@Override
	public GenerateEquipmentInfoLocalService getWrappedService() {
		return _generateEquipmentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		GenerateEquipmentInfoLocalService generateEquipmentInfoLocalService) {

		_generateEquipmentInfoLocalService = generateEquipmentInfoLocalService;
	}

	private GenerateEquipmentInfoLocalService
		_generateEquipmentInfoLocalService;

}