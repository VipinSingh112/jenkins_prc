/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuCompanyInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoLocalService
 * @generated
 */
public class ManuCompanyInfoLocalServiceWrapper
	implements ManuCompanyInfoLocalService,
			   ServiceWrapper<ManuCompanyInfoLocalService> {

	public ManuCompanyInfoLocalServiceWrapper() {
		this(null);
	}

	public ManuCompanyInfoLocalServiceWrapper(
		ManuCompanyInfoLocalService manuCompanyInfoLocalService) {

		_manuCompanyInfoLocalService = manuCompanyInfoLocalService;
	}

	/**
	 * Adds the manu company info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfo the manu company info
	 * @return the manu company info that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
		addManuCompanyInfo(
			com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
				manuCompanyInfo) {

		return _manuCompanyInfoLocalService.addManuCompanyInfo(manuCompanyInfo);
	}

	/**
	 * Creates a new manu company info with the primary key. Does not add the manu company info to the database.
	 *
	 * @param manuCompanyInfoId the primary key for the new manu company info
	 * @return the new manu company info
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
		createManuCompanyInfo(long manuCompanyInfoId) {

		return _manuCompanyInfoLocalService.createManuCompanyInfo(
			manuCompanyInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the manu company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info that was removed
	 * @throws PortalException if a manu company info with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
			deleteManuCompanyInfo(long manuCompanyInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoLocalService.deleteManuCompanyInfo(
			manuCompanyInfoId);
	}

	/**
	 * Deletes the manu company info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfo the manu company info
	 * @return the manu company info that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
		deleteManuCompanyInfo(
			com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
				manuCompanyInfo) {

		return _manuCompanyInfoLocalService.deleteManuCompanyInfo(
			manuCompanyInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuCompanyInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuCompanyInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuCompanyInfoLocalService.dynamicQuery();
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

		return _manuCompanyInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoModelImpl</code>.
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

		return _manuCompanyInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoModelImpl</code>.
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

		return _manuCompanyInfoLocalService.dynamicQuery(
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

		return _manuCompanyInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _manuCompanyInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
		fetchManuCompanyInfo(long manuCompanyInfoId) {

		return _manuCompanyInfoLocalService.fetchManuCompanyInfo(
			manuCompanyInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuCompanyInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuCompanyInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
		getMA_CI_MAI(long applicationId) {

		return _manuCompanyInfoLocalService.getMA_CI_MAI(applicationId);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
		getManuById(long applicationId) {

		return _manuCompanyInfoLocalService.getManuById(applicationId);
	}

	/**
	 * Returns the manu company info with the primary key.
	 *
	 * @param manuCompanyInfoId the primary key of the manu company info
	 * @return the manu company info
	 * @throws PortalException if a manu company info with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
			getManuCompanyInfo(long manuCompanyInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoLocalService.getManuCompanyInfo(
			manuCompanyInfoId);
	}

	/**
	 * Returns a range of all the manu company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company infos
	 * @param end the upper bound of the range of manu company infos (not inclusive)
	 * @return the range of manu company infos
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo>
			getManuCompanyInfos(int start, int end) {

		return _manuCompanyInfoLocalService.getManuCompanyInfos(start, end);
	}

	/**
	 * Returns the number of manu company infos.
	 *
	 * @return the number of manu company infos
	 */
	@Override
	public int getManuCompanyInfosCount() {
		return _manuCompanyInfoLocalService.getManuCompanyInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuCompanyInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuCompanyInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manu company info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuCompanyInfo the manu company info
	 * @return the manu company info that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
		updateManuCompanyInfo(
			com.nbp.manufacturing.application.form.service.model.ManuCompanyInfo
				manuCompanyInfo) {

		return _manuCompanyInfoLocalService.updateManuCompanyInfo(
			manuCompanyInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuCompanyInfoLocalService.getBasePersistence();
	}

	@Override
	public ManuCompanyInfoLocalService getWrappedService() {
		return _manuCompanyInfoLocalService;
	}

	@Override
	public void setWrappedService(
		ManuCompanyInfoLocalService manuCompanyInfoLocalService) {

		_manuCompanyInfoLocalService = manuCompanyInfoLocalService;
	}

	private ManuCompanyInfoLocalService _manuCompanyInfoLocalService;

}