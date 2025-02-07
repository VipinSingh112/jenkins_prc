/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabActivitiesDescLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabActivitiesDescLocalService
 * @generated
 */
public class AccMediLabActivitiesDescLocalServiceWrapper
	implements AccMediLabActivitiesDescLocalService,
			   ServiceWrapper<AccMediLabActivitiesDescLocalService> {

	public AccMediLabActivitiesDescLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabActivitiesDescLocalServiceWrapper(
		AccMediLabActivitiesDescLocalService
			accMediLabActivitiesDescLocalService) {

		_accMediLabActivitiesDescLocalService =
			accMediLabActivitiesDescLocalService;
	}

	/**
	 * Adds the acc medi lab activities desc to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabActivitiesDescLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabActivitiesDesc the acc medi lab activities desc
	 * @return the acc medi lab activities desc that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
			addAccMediLabActivitiesDesc(
				com.nbp.janaac.application.form.service.model.
					AccMediLabActivitiesDesc accMediLabActivitiesDesc) {

		return _accMediLabActivitiesDescLocalService.
			addAccMediLabActivitiesDesc(accMediLabActivitiesDesc);
	}

	/**
	 * Creates a new acc medi lab activities desc with the primary key. Does not add the acc medi lab activities desc to the database.
	 *
	 * @param accMediLabActivitiesDescId the primary key for the new acc medi lab activities desc
	 * @return the new acc medi lab activities desc
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
			createAccMediLabActivitiesDesc(long accMediLabActivitiesDescId) {

		return _accMediLabActivitiesDescLocalService.
			createAccMediLabActivitiesDesc(accMediLabActivitiesDescId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabActivitiesDescLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab activities desc from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabActivitiesDescLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabActivitiesDesc the acc medi lab activities desc
	 * @return the acc medi lab activities desc that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
			deleteAccMediLabActivitiesDesc(
				com.nbp.janaac.application.form.service.model.
					AccMediLabActivitiesDesc accMediLabActivitiesDesc) {

		return _accMediLabActivitiesDescLocalService.
			deleteAccMediLabActivitiesDesc(accMediLabActivitiesDesc);
	}

	/**
	 * Deletes the acc medi lab activities desc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabActivitiesDescLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabActivitiesDescId the primary key of the acc medi lab activities desc
	 * @return the acc medi lab activities desc that was removed
	 * @throws PortalException if a acc medi lab activities desc with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
				deleteAccMediLabActivitiesDesc(long accMediLabActivitiesDescId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabActivitiesDescLocalService.
			deleteAccMediLabActivitiesDesc(accMediLabActivitiesDescId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabActivitiesDescLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabActivitiesDescLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabActivitiesDescLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabActivitiesDescLocalService.dynamicQuery();
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

		return _accMediLabActivitiesDescLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabActivitiesDescModelImpl</code>.
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

		return _accMediLabActivitiesDescLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabActivitiesDescModelImpl</code>.
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

		return _accMediLabActivitiesDescLocalService.dynamicQuery(
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

		return _accMediLabActivitiesDescLocalService.dynamicQueryCount(
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

		return _accMediLabActivitiesDescLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
			fetchAccMediLabActivitiesDesc(long accMediLabActivitiesDescId) {

		return _accMediLabActivitiesDescLocalService.
			fetchAccMediLabActivitiesDesc(accMediLabActivitiesDescId);
	}

	/**
	 * Returns the acc medi lab activities desc matching the UUID and group.
	 *
	 * @param uuid the acc medi lab activities desc's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab activities desc, or <code>null</code> if a matching acc medi lab activities desc could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
			fetchAccMediLabActivitiesDescByUuidAndGroupId(
				String uuid, long groupId) {

		return _accMediLabActivitiesDescLocalService.
			fetchAccMediLabActivitiesDescByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab activities desc with the primary key.
	 *
	 * @param accMediLabActivitiesDescId the primary key of the acc medi lab activities desc
	 * @return the acc medi lab activities desc
	 * @throws PortalException if a acc medi lab activities desc with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
				getAccMediLabActivitiesDesc(long accMediLabActivitiesDescId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabActivitiesDescLocalService.
			getAccMediLabActivitiesDesc(accMediLabActivitiesDescId);
	}

	/**
	 * Returns the acc medi lab activities desc matching the UUID and group.
	 *
	 * @param uuid the acc medi lab activities desc's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab activities desc
	 * @throws PortalException if a matching acc medi lab activities desc could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
				getAccMediLabActivitiesDescByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabActivitiesDescLocalService.
			getAccMediLabActivitiesDescByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab activities descs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabActivitiesDescModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @return the range of acc medi lab activities descs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc>
			getAccMediLabActivitiesDescs(int start, int end) {

		return _accMediLabActivitiesDescLocalService.
			getAccMediLabActivitiesDescs(start, end);
	}

	/**
	 * Returns all the acc medi lab activities descs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab activities descs
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab activities descs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc>
			getAccMediLabActivitiesDescsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accMediLabActivitiesDescLocalService.
			getAccMediLabActivitiesDescsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab activities descs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab activities descs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab activities descs
	 * @param end the upper bound of the range of acc medi lab activities descs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab activities descs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc>
			getAccMediLabActivitiesDescsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccMediLabActivitiesDesc> orderByComparator) {

		return _accMediLabActivitiesDescLocalService.
			getAccMediLabActivitiesDescsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab activities descs.
	 *
	 * @return the number of acc medi lab activities descs
	 */
	@Override
	public int getAccMediLabActivitiesDescsCount() {
		return _accMediLabActivitiesDescLocalService.
			getAccMediLabActivitiesDescsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabActivitiesDescLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabActivitiesDescLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabActivitiesDescLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
				getJANAAC_ByApplicationId(long janaacApplicationId)
			throws com.nbp.janaac.application.form.service.exception.
				NoSuchAccMediLabActivitiesDescException {

		return _accMediLabActivitiesDescLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabActivitiesDescLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabActivitiesDescLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab activities desc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabActivitiesDescLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabActivitiesDesc the acc medi lab activities desc
	 * @return the acc medi lab activities desc that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc
			updateAccMediLabActivitiesDesc(
				com.nbp.janaac.application.form.service.model.
					AccMediLabActivitiesDesc accMediLabActivitiesDesc) {

		return _accMediLabActivitiesDescLocalService.
			updateAccMediLabActivitiesDesc(accMediLabActivitiesDesc);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabActivitiesDescLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabActivitiesDescLocalService getWrappedService() {
		return _accMediLabActivitiesDescLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabActivitiesDescLocalService
			accMediLabActivitiesDescLocalService) {

		_accMediLabActivitiesDescLocalService =
			accMediLabActivitiesDescLocalService;
	}

	private AccMediLabActivitiesDescLocalService
		_accMediLabActivitiesDescLocalService;

}