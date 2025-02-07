/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadionuclideInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideInfoLocalService
 * @generated
 */
public class RadionuclideInfoLocalServiceWrapper
	implements RadionuclideInfoLocalService,
			   ServiceWrapper<RadionuclideInfoLocalService> {

	public RadionuclideInfoLocalServiceWrapper() {
		this(null);
	}

	public RadionuclideInfoLocalServiceWrapper(
		RadionuclideInfoLocalService radionuclideInfoLocalService) {

		_radionuclideInfoLocalService = radionuclideInfoLocalService;
	}

	/**
	 * Adds the radionuclide info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideInfo the radionuclide info
	 * @return the radionuclide info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo
		addRadionuclideInfo(
			com.nbp.hsra.application.service.model.RadionuclideInfo
				radionuclideInfo) {

		return _radionuclideInfoLocalService.addRadionuclideInfo(
			radionuclideInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new radionuclide info with the primary key. Does not add the radionuclide info to the database.
	 *
	 * @param radionuclideInfoId the primary key for the new radionuclide info
	 * @return the new radionuclide info
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo
		createRadionuclideInfo(long radionuclideInfoId) {

		return _radionuclideInfoLocalService.createRadionuclideInfo(
			radionuclideInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radionuclide info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info that was removed
	 * @throws PortalException if a radionuclide info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo
			deleteRadionuclideInfo(long radionuclideInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideInfoLocalService.deleteRadionuclideInfo(
			radionuclideInfoId);
	}

	/**
	 * Deletes the radionuclide info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideInfo the radionuclide info
	 * @return the radionuclide info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo
		deleteRadionuclideInfo(
			com.nbp.hsra.application.service.model.RadionuclideInfo
				radionuclideInfo) {

		return _radionuclideInfoLocalService.deleteRadionuclideInfo(
			radionuclideInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radionuclideInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radionuclideInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radionuclideInfoLocalService.dynamicQuery();
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

		return _radionuclideInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadionuclideInfoModelImpl</code>.
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

		return _radionuclideInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadionuclideInfoModelImpl</code>.
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

		return _radionuclideInfoLocalService.dynamicQuery(
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

		return _radionuclideInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _radionuclideInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo
		fetchRadionuclideInfo(long radionuclideInfoId) {

		return _radionuclideInfoLocalService.fetchRadionuclideInfo(
			radionuclideInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radionuclideInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo getHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideInfoException {

		return _radionuclideInfoLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radionuclideInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radionuclideInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the radionuclide info with the primary key.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info
	 * @throws PortalException if a radionuclide info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo
			getRadionuclideInfo(long radionuclideInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radionuclideInfoLocalService.getRadionuclideInfo(
			radionuclideInfoId);
	}

	/**
	 * Returns a range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @return the range of radionuclide infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadionuclideInfo>
			getRadionuclideInfos(int start, int end) {

		return _radionuclideInfoLocalService.getRadionuclideInfos(start, end);
	}

	/**
	 * Returns the number of radionuclide infos.
	 *
	 * @return the number of radionuclide infos
	 */
	@Override
	public int getRadionuclideInfosCount() {
		return _radionuclideInfoLocalService.getRadionuclideInfosCount();
	}

	/**
	 * Updates the radionuclide info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadionuclideInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radionuclideInfo the radionuclide info
	 * @return the radionuclide info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadionuclideInfo
		updateRadionuclideInfo(
			com.nbp.hsra.application.service.model.RadionuclideInfo
				radionuclideInfo) {

		return _radionuclideInfoLocalService.updateRadionuclideInfo(
			radionuclideInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radionuclideInfoLocalService.getBasePersistence();
	}

	@Override
	public RadionuclideInfoLocalService getWrappedService() {
		return _radionuclideInfoLocalService;
	}

	@Override
	public void setWrappedService(
		RadionuclideInfoLocalService radionuclideInfoLocalService) {

		_radionuclideInfoLocalService = radionuclideInfoLocalService;
	}

	private RadionuclideInfoLocalService _radionuclideInfoLocalService;

}