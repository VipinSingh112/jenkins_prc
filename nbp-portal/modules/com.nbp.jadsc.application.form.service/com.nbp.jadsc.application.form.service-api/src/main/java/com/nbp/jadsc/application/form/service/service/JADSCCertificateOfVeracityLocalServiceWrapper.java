/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCCertificateOfVeracityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracityLocalService
 * @generated
 */
public class JADSCCertificateOfVeracityLocalServiceWrapper
	implements JADSCCertificateOfVeracityLocalService,
			   ServiceWrapper<JADSCCertificateOfVeracityLocalService> {

	public JADSCCertificateOfVeracityLocalServiceWrapper() {
		this(null);
	}

	public JADSCCertificateOfVeracityLocalServiceWrapper(
		JADSCCertificateOfVeracityLocalService
			jadscCertificateOfVeracityLocalService) {

		_jadscCertificateOfVeracityLocalService =
			jadscCertificateOfVeracityLocalService;
	}

	/**
	 * Adds the jadsc certificate of veracity to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was added
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
			addJADSCCertificateOfVeracity(
				com.nbp.jadsc.application.form.service.model.
					JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return _jadscCertificateOfVeracityLocalService.
			addJADSCCertificateOfVeracity(jadscCertificateOfVeracity);
	}

	/**
	 * Creates a new jadsc certificate of veracity with the primary key. Does not add the jadsc certificate of veracity to the database.
	 *
	 * @param jadscCOVId the primary key for the new jadsc certificate of veracity
	 * @return the new jadsc certificate of veracity
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
			createJADSCCertificateOfVeracity(long jadscCOVId) {

		return _jadscCertificateOfVeracityLocalService.
			createJADSCCertificateOfVeracity(jadscCOVId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfVeracityLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc certificate of veracity from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
			deleteJADSCCertificateOfVeracity(
				com.nbp.jadsc.application.form.service.model.
					JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return _jadscCertificateOfVeracityLocalService.
			deleteJADSCCertificateOfVeracity(jadscCertificateOfVeracity);
	}

	/**
	 * Deletes the jadsc certificate of veracity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 * @throws PortalException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
				deleteJADSCCertificateOfVeracity(long jadscCOVId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfVeracityLocalService.
			deleteJADSCCertificateOfVeracity(jadscCOVId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfVeracityLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscCertificateOfVeracityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscCertificateOfVeracityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscCertificateOfVeracityLocalService.dynamicQuery();
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

		return _jadscCertificateOfVeracityLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl</code>.
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

		return _jadscCertificateOfVeracityLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl</code>.
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

		return _jadscCertificateOfVeracityLocalService.dynamicQuery(
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

		return _jadscCertificateOfVeracityLocalService.dynamicQueryCount(
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

		return _jadscCertificateOfVeracityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
			fetchJADSCCertificateOfVeracity(long jadscCOVId) {

		return _jadscCertificateOfVeracityLocalService.
			fetchJADSCCertificateOfVeracity(jadscCOVId);
	}

	/**
	 * Returns the jadsc certificate of veracity matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of veracity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
			fetchJADSCCertificateOfVeracityByUuidAndGroupId(
				String uuid, long groupId) {

		return _jadscCertificateOfVeracityLocalService.
			fetchJADSCCertificateOfVeracityByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscCertificateOfVeracityLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscCertificateOfVeracityLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscCertificateOfVeracityLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
				getJADSCBy_Id(long jadscApplicationId)
			throws com.nbp.jadsc.application.form.service.exception.
				NoSuchJADSCCertificateOfVeracityException {

		return _jadscCertificateOfVeracityLocalService.getJADSCBy_Id(
			jadscApplicationId);
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of jadsc certificate of veracities
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.
			JADSCCertificateOfVeracity> getJADSCCertificateOfVeracities(
				int start, int end) {

		return _jadscCertificateOfVeracityLocalService.
			getJADSCCertificateOfVeracities(start, end);
	}

	/**
	 * Returns all the jadsc certificate of veracities matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of veracities
	 * @param companyId the primary key of the company
	 * @return the matching jadsc certificate of veracities, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.
			JADSCCertificateOfVeracity>
				getJADSCCertificateOfVeracitiesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _jadscCertificateOfVeracityLocalService.
			getJADSCCertificateOfVeracitiesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc certificate of veracities matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc certificate of veracities
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc certificate of veracities, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.
			JADSCCertificateOfVeracity>
				getJADSCCertificateOfVeracitiesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.jadsc.application.form.service.model.
							JADSCCertificateOfVeracity> orderByComparator) {

		return _jadscCertificateOfVeracityLocalService.
			getJADSCCertificateOfVeracitiesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc certificate of veracities.
	 *
	 * @return the number of jadsc certificate of veracities
	 */
	@Override
	public int getJADSCCertificateOfVeracitiesCount() {
		return _jadscCertificateOfVeracityLocalService.
			getJADSCCertificateOfVeracitiesCount();
	}

	/**
	 * Returns the jadsc certificate of veracity with the primary key.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity
	 * @throws PortalException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
				getJADSCCertificateOfVeracity(long jadscCOVId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfVeracityLocalService.
			getJADSCCertificateOfVeracity(jadscCOVId);
	}

	/**
	 * Returns the jadsc certificate of veracity matching the UUID and group.
	 *
	 * @param uuid the jadsc certificate of veracity's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc certificate of veracity
	 * @throws PortalException if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
				getJADSCCertificateOfVeracityByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfVeracityLocalService.
			getJADSCCertificateOfVeracityByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscCertificateOfVeracityLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscCertificateOfVeracityLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc certificate of veracity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCertificateOfVeracityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was updated
	 */
	@Override
	public
		com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity
			updateJADSCCertificateOfVeracity(
				com.nbp.jadsc.application.form.service.model.
					JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		return _jadscCertificateOfVeracityLocalService.
			updateJADSCCertificateOfVeracity(jadscCertificateOfVeracity);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscCertificateOfVeracityLocalService.getBasePersistence();
	}

	@Override
	public JADSCCertificateOfVeracityLocalService getWrappedService() {
		return _jadscCertificateOfVeracityLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCCertificateOfVeracityLocalService
			jadscCertificateOfVeracityLocalService) {

		_jadscCertificateOfVeracityLocalService =
			jadscCertificateOfVeracityLocalService;
	}

	private JADSCCertificateOfVeracityLocalService
		_jadscCertificateOfVeracityLocalService;

}