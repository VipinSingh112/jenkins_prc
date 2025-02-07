/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccMediLabTestDescriptionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescriptionLocalService
 * @generated
 */
public class AccMediLabTestDescriptionLocalServiceWrapper
	implements AccMediLabTestDescriptionLocalService,
			   ServiceWrapper<AccMediLabTestDescriptionLocalService> {

	public AccMediLabTestDescriptionLocalServiceWrapper() {
		this(null);
	}

	public AccMediLabTestDescriptionLocalServiceWrapper(
		AccMediLabTestDescriptionLocalService
			accMediLabTestDescriptionLocalService) {

		_accMediLabTestDescriptionLocalService =
			accMediLabTestDescriptionLocalService;
	}

	/**
	 * Adds the acc medi lab test description to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescription the acc medi lab test description
	 * @return the acc medi lab test description that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
			addAccMediLabTestDescription(
				com.nbp.janaac.application.form.service.model.
					AccMediLabTestDescription accMediLabTestDescription) {

		return _accMediLabTestDescriptionLocalService.
			addAccMediLabTestDescription(accMediLabTestDescription);
	}

	/**
	 * Creates a new acc medi lab test description with the primary key. Does not add the acc medi lab test description to the database.
	 *
	 * @param accMediLabTestDescriptionId the primary key for the new acc medi lab test description
	 * @return the new acc medi lab test description
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
			createAccMediLabTestDescription(long accMediLabTestDescriptionId) {

		return _accMediLabTestDescriptionLocalService.
			createAccMediLabTestDescription(accMediLabTestDescriptionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestDescriptionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc medi lab test description from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescription the acc medi lab test description
	 * @return the acc medi lab test description that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
			deleteAccMediLabTestDescription(
				com.nbp.janaac.application.form.service.model.
					AccMediLabTestDescription accMediLabTestDescription) {

		return _accMediLabTestDescriptionLocalService.
			deleteAccMediLabTestDescription(accMediLabTestDescription);
	}

	/**
	 * Deletes the acc medi lab test description with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescriptionId the primary key of the acc medi lab test description
	 * @return the acc medi lab test description that was removed
	 * @throws PortalException if a acc medi lab test description with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
				deleteAccMediLabTestDescription(
					long accMediLabTestDescriptionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestDescriptionLocalService.
			deleteAccMediLabTestDescription(accMediLabTestDescriptionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestDescriptionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accMediLabTestDescriptionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accMediLabTestDescriptionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accMediLabTestDescriptionLocalService.dynamicQuery();
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

		return _accMediLabTestDescriptionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionModelImpl</code>.
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

		return _accMediLabTestDescriptionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionModelImpl</code>.
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

		return _accMediLabTestDescriptionLocalService.dynamicQuery(
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

		return _accMediLabTestDescriptionLocalService.dynamicQueryCount(
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

		return _accMediLabTestDescriptionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
			fetchAccMediLabTestDescription(long accMediLabTestDescriptionId) {

		return _accMediLabTestDescriptionLocalService.
			fetchAccMediLabTestDescription(accMediLabTestDescriptionId);
	}

	/**
	 * Returns the acc medi lab test description matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test description's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test description, or <code>null</code> if a matching acc medi lab test description could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
			fetchAccMediLabTestDescriptionByUuidAndGroupId(
				String uuid, long groupId) {

		return _accMediLabTestDescriptionLocalService.
			fetchAccMediLabTestDescriptionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab test description with the primary key.
	 *
	 * @param accMediLabTestDescriptionId the primary key of the acc medi lab test description
	 * @return the acc medi lab test description
	 * @throws PortalException if a acc medi lab test description with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
				getAccMediLabTestDescription(long accMediLabTestDescriptionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestDescriptionLocalService.
			getAccMediLabTestDescription(accMediLabTestDescriptionId);
	}

	/**
	 * Returns the acc medi lab test description matching the UUID and group.
	 *
	 * @param uuid the acc medi lab test description's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab test description
	 * @throws PortalException if a matching acc medi lab test description could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
				getAccMediLabTestDescriptionByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestDescriptionLocalService.
			getAccMediLabTestDescriptionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab test descriptions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @return the range of acc medi lab test descriptions
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabTestDescription> getAccMediLabTestDescriptions(
				int start, int end) {

		return _accMediLabTestDescriptionLocalService.
			getAccMediLabTestDescriptions(start, end);
	}

	/**
	 * Returns all the acc medi lab test descriptions matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test descriptions
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab test descriptions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabTestDescription>
				getAccMediLabTestDescriptionsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _accMediLabTestDescriptionLocalService.
			getAccMediLabTestDescriptionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab test descriptions matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab test descriptions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab test descriptions
	 * @param end the upper bound of the range of acc medi lab test descriptions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab test descriptions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AccMediLabTestDescription>
				getAccMediLabTestDescriptionsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.janaac.application.form.service.model.
							AccMediLabTestDescription> orderByComparator) {

		return _accMediLabTestDescriptionLocalService.
			getAccMediLabTestDescriptionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab test descriptions.
	 *
	 * @return the number of acc medi lab test descriptions
	 */
	@Override
	public int getAccMediLabTestDescriptionsCount() {
		return _accMediLabTestDescriptionLocalService.
			getAccMediLabTestDescriptionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accMediLabTestDescriptionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accMediLabTestDescriptionLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accMediLabTestDescriptionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
				getJANAAC_ByApplicationId(long janaacApplicationId)
			throws com.nbp.janaac.application.form.service.exception.
				NoSuchAccMediLabTestDescriptionException {

		return _accMediLabTestDescriptionLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accMediLabTestDescriptionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accMediLabTestDescriptionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc medi lab test description in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabTestDescriptionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabTestDescription the acc medi lab test description
	 * @return the acc medi lab test description that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AccMediLabTestDescription
			updateAccMediLabTestDescription(
				com.nbp.janaac.application.form.service.model.
					AccMediLabTestDescription accMediLabTestDescription) {

		return _accMediLabTestDescriptionLocalService.
			updateAccMediLabTestDescription(accMediLabTestDescription);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accMediLabTestDescriptionLocalService.getBasePersistence();
	}

	@Override
	public AccMediLabTestDescriptionLocalService getWrappedService() {
		return _accMediLabTestDescriptionLocalService;
	}

	@Override
	public void setWrappedService(
		AccMediLabTestDescriptionLocalService
			accMediLabTestDescriptionLocalService) {

		_accMediLabTestDescriptionLocalService =
			accMediLabTestDescriptionLocalService;
	}

	private AccMediLabTestDescriptionLocalService
		_accMediLabTestDescriptionLocalService;

}