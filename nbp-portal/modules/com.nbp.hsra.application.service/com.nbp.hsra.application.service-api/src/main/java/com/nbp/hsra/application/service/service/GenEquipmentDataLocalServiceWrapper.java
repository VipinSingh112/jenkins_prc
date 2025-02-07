/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link GenEquipmentDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GenEquipmentDataLocalService
 * @generated
 */
public class GenEquipmentDataLocalServiceWrapper
	implements GenEquipmentDataLocalService,
			   ServiceWrapper<GenEquipmentDataLocalService> {

	public GenEquipmentDataLocalServiceWrapper() {
		this(null);
	}

	public GenEquipmentDataLocalServiceWrapper(
		GenEquipmentDataLocalService genEquipmentDataLocalService) {

		_genEquipmentDataLocalService = genEquipmentDataLocalService;
	}

	/**
	 * Adds the gen equipment data to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenEquipmentDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genEquipmentData the gen equipment data
	 * @return the gen equipment data that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenEquipmentData
		addGenEquipmentData(
			com.nbp.hsra.application.service.model.GenEquipmentData
				genEquipmentData) {

		return _genEquipmentDataLocalService.addGenEquipmentData(
			genEquipmentData);
	}

	/**
	 * Creates a new gen equipment data with the primary key. Does not add the gen equipment data to the database.
	 *
	 * @param genEquipmentDataId the primary key for the new gen equipment data
	 * @return the new gen equipment data
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenEquipmentData
		createGenEquipmentData(long genEquipmentDataId) {

		return _genEquipmentDataLocalService.createGenEquipmentData(
			genEquipmentDataId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genEquipmentDataLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the gen equipment data from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenEquipmentDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genEquipmentData the gen equipment data
	 * @return the gen equipment data that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenEquipmentData
		deleteGenEquipmentData(
			com.nbp.hsra.application.service.model.GenEquipmentData
				genEquipmentData) {

		return _genEquipmentDataLocalService.deleteGenEquipmentData(
			genEquipmentData);
	}

	/**
	 * Deletes the gen equipment data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenEquipmentDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data that was removed
	 * @throws PortalException if a gen equipment data with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenEquipmentData
			deleteGenEquipmentData(long genEquipmentDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genEquipmentDataLocalService.deleteGenEquipmentData(
			genEquipmentDataId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genEquipmentDataLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _genEquipmentDataLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _genEquipmentDataLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _genEquipmentDataLocalService.dynamicQuery();
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

		return _genEquipmentDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.GenEquipmentDataModelImpl</code>.
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

		return _genEquipmentDataLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.GenEquipmentDataModelImpl</code>.
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

		return _genEquipmentDataLocalService.dynamicQuery(
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

		return _genEquipmentDataLocalService.dynamicQueryCount(dynamicQuery);
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

		return _genEquipmentDataLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.GenEquipmentData
		fetchGenEquipmentData(long genEquipmentDataId) {

		return _genEquipmentDataLocalService.fetchGenEquipmentData(
			genEquipmentDataId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _genEquipmentDataLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the gen equipment data with the primary key.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data
	 * @throws PortalException if a gen equipment data with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenEquipmentData
			getGenEquipmentData(long genEquipmentDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genEquipmentDataLocalService.getGenEquipmentData(
			genEquipmentDataId);
	}

	/**
	 * Returns a range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @return the range of gen equipment datas
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.GenEquipmentData>
			getGenEquipmentDatas(int start, int end) {

		return _genEquipmentDataLocalService.getGenEquipmentDatas(start, end);
	}

	/**
	 * Returns the number of gen equipment datas.
	 *
	 * @return the number of gen equipment datas
	 */
	@Override
	public int getGenEquipmentDatasCount() {
		return _genEquipmentDataLocalService.getGenEquipmentDatasCount();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.GenEquipmentData> getHsraById(
			long hsraApplicationId) {

		return _genEquipmentDataLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _genEquipmentDataLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _genEquipmentDataLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genEquipmentDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the gen equipment data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenEquipmentDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genEquipmentData the gen equipment data
	 * @return the gen equipment data that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.GenEquipmentData
		updateGenEquipmentData(
			com.nbp.hsra.application.service.model.GenEquipmentData
				genEquipmentData) {

		return _genEquipmentDataLocalService.updateGenEquipmentData(
			genEquipmentData);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _genEquipmentDataLocalService.getBasePersistence();
	}

	@Override
	public GenEquipmentDataLocalService getWrappedService() {
		return _genEquipmentDataLocalService;
	}

	@Override
	public void setWrappedService(
		GenEquipmentDataLocalService genEquipmentDataLocalService) {

		_genEquipmentDataLocalService = genEquipmentDataLocalService;
	}

	private GenEquipmentDataLocalService _genEquipmentDataLocalService;

}