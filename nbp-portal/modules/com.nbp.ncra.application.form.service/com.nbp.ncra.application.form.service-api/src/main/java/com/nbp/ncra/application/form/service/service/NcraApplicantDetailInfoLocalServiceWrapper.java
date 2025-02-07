/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraApplicantDetailInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicantDetailInfoLocalService
 * @generated
 */
public class NcraApplicantDetailInfoLocalServiceWrapper
	implements NcraApplicantDetailInfoLocalService,
			   ServiceWrapper<NcraApplicantDetailInfoLocalService> {

	public NcraApplicantDetailInfoLocalServiceWrapper() {
		this(null);
	}

	public NcraApplicantDetailInfoLocalServiceWrapper(
		NcraApplicantDetailInfoLocalService
			ncraApplicantDetailInfoLocalService) {

		_ncraApplicantDetailInfoLocalService =
			ncraApplicantDetailInfoLocalService;
	}

	/**
	 * Adds the ncra applicant detail info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicantDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicantDetailInfo the ncra applicant detail info
	 * @return the ncra applicant detail info that was added
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
		addNcraApplicantDetailInfo(
			com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
				ncraApplicantDetailInfo) {

		return _ncraApplicantDetailInfoLocalService.addNcraApplicantDetailInfo(
			ncraApplicantDetailInfo);
	}

	/**
	 * Creates a new ncra applicant detail info with the primary key. Does not add the ncra applicant detail info to the database.
	 *
	 * @param ncraApplicantDetailInfoId the primary key for the new ncra applicant detail info
	 * @return the new ncra applicant detail info
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
		createNcraApplicantDetailInfo(long ncraApplicantDetailInfoId) {

		return _ncraApplicantDetailInfoLocalService.
			createNcraApplicantDetailInfo(ncraApplicantDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicantDetailInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncra applicant detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicantDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info that was removed
	 * @throws PortalException if a ncra applicant detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
			deleteNcraApplicantDetailInfo(long ncraApplicantDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicantDetailInfoLocalService.
			deleteNcraApplicantDetailInfo(ncraApplicantDetailInfoId);
	}

	/**
	 * Deletes the ncra applicant detail info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicantDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicantDetailInfo the ncra applicant detail info
	 * @return the ncra applicant detail info that was removed
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
		deleteNcraApplicantDetailInfo(
			com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
				ncraApplicantDetailInfo) {

		return _ncraApplicantDetailInfoLocalService.
			deleteNcraApplicantDetailInfo(ncraApplicantDetailInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicantDetailInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraApplicantDetailInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraApplicantDetailInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraApplicantDetailInfoLocalService.dynamicQuery();
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

		return _ncraApplicantDetailInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicantDetailInfoModelImpl</code>.
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

		return _ncraApplicantDetailInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicantDetailInfoModelImpl</code>.
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

		return _ncraApplicantDetailInfoLocalService.dynamicQuery(
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

		return _ncraApplicantDetailInfoLocalService.dynamicQueryCount(
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

		return _ncraApplicantDetailInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
		fetchNcraApplicantDetailInfo(long ncraApplicantDetailInfoId) {

		return _ncraApplicantDetailInfoLocalService.
			fetchNcraApplicantDetailInfo(ncraApplicantDetailInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraApplicantDetailInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraApplicantDetailInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncra applicant detail info with the primary key.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info
	 * @throws PortalException if a ncra applicant detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
			getNcraApplicantDetailInfo(long ncraApplicantDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicantDetailInfoLocalService.getNcraApplicantDetailInfo(
			ncraApplicantDetailInfoId);
	}

	/**
	 * Returns a range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @return the range of ncra applicant detail infos
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo>
			getNcraApplicantDetailInfos(int start, int end) {

		return _ncraApplicantDetailInfoLocalService.getNcraApplicantDetailInfos(
			start, end);
	}

	/**
	 * Returns the number of ncra applicant detail infos.
	 *
	 * @return the number of ncra applicant detail infos
	 */
	@Override
	public int getNcraApplicantDetailInfosCount() {
		return _ncraApplicantDetailInfoLocalService.
			getNcraApplicantDetailInfosCount();
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
			getNcraDetail_By_App_Id(long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicantDetailInfoException {

		return _ncraApplicantDetailInfoLocalService.getNcraDetail_By_App_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraApplicantDetailInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicantDetailInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncra applicant detail info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicantDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicantDetailInfo the ncra applicant detail info
	 * @return the ncra applicant detail info that was updated
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
		updateNcraApplicantDetailInfo(
			com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo
				ncraApplicantDetailInfo) {

		return _ncraApplicantDetailInfoLocalService.
			updateNcraApplicantDetailInfo(ncraApplicantDetailInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraApplicantDetailInfoLocalService.getBasePersistence();
	}

	@Override
	public NcraApplicantDetailInfoLocalService getWrappedService() {
		return _ncraApplicantDetailInfoLocalService;
	}

	@Override
	public void setWrappedService(
		NcraApplicantDetailInfoLocalService
			ncraApplicantDetailInfoLocalService) {

		_ncraApplicantDetailInfoLocalService =
			ncraApplicantDetailInfoLocalService;
	}

	private NcraApplicantDetailInfoLocalService
		_ncraApplicantDetailInfoLocalService;

}