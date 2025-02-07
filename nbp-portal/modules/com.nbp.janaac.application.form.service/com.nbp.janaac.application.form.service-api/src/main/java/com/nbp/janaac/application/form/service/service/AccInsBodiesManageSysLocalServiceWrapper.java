/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccInsBodiesManageSysLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesManageSysLocalService
 * @generated
 */
public class AccInsBodiesManageSysLocalServiceWrapper
	implements AccInsBodiesManageSysLocalService,
			   ServiceWrapper<AccInsBodiesManageSysLocalService> {

	public AccInsBodiesManageSysLocalServiceWrapper() {
		this(null);
	}

	public AccInsBodiesManageSysLocalServiceWrapper(
		AccInsBodiesManageSysLocalService accInsBodiesManageSysLocalService) {

		_accInsBodiesManageSysLocalService = accInsBodiesManageSysLocalService;
	}

	/**
	 * Adds the acc ins bodies manage sys to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesManageSysLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesManageSys the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
		addAccInsBodiesManageSys(
			com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
				accInsBodiesManageSys) {

		return _accInsBodiesManageSysLocalService.addAccInsBodiesManageSys(
			accInsBodiesManageSys);
	}

	/**
	 * Creates a new acc ins bodies manage sys with the primary key. Does not add the acc ins bodies manage sys to the database.
	 *
	 * @param accInsBodiesManageSysId the primary key for the new acc ins bodies manage sys
	 * @return the new acc ins bodies manage sys
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
		createAccInsBodiesManageSys(long accInsBodiesManageSysId) {

		return _accInsBodiesManageSysLocalService.createAccInsBodiesManageSys(
			accInsBodiesManageSysId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesManageSysLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc ins bodies manage sys from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesManageSysLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesManageSys the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
		deleteAccInsBodiesManageSys(
			com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
				accInsBodiesManageSys) {

		return _accInsBodiesManageSysLocalService.deleteAccInsBodiesManageSys(
			accInsBodiesManageSys);
	}

	/**
	 * Deletes the acc ins bodies manage sys with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesManageSysLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesManageSysId the primary key of the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys that was removed
	 * @throws PortalException if a acc ins bodies manage sys with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
			deleteAccInsBodiesManageSys(long accInsBodiesManageSysId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesManageSysLocalService.deleteAccInsBodiesManageSys(
			accInsBodiesManageSysId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesManageSysLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accInsBodiesManageSysLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accInsBodiesManageSysLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accInsBodiesManageSysLocalService.dynamicQuery();
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

		return _accInsBodiesManageSysLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesManageSysModelImpl</code>.
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

		return _accInsBodiesManageSysLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesManageSysModelImpl</code>.
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

		return _accInsBodiesManageSysLocalService.dynamicQuery(
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

		return _accInsBodiesManageSysLocalService.dynamicQueryCount(
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

		return _accInsBodiesManageSysLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
		fetchAccInsBodiesManageSys(long accInsBodiesManageSysId) {

		return _accInsBodiesManageSysLocalService.fetchAccInsBodiesManageSys(
			accInsBodiesManageSysId);
	}

	/**
	 * Returns the acc ins bodies manage sys matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies manage sys's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies manage sys, or <code>null</code> if a matching acc ins bodies manage sys could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
		fetchAccInsBodiesManageSysByUuidAndGroupId(String uuid, long groupId) {

		return _accInsBodiesManageSysLocalService.
			fetchAccInsBodiesManageSysByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies manage sys with the primary key.
	 *
	 * @param accInsBodiesManageSysId the primary key of the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys
	 * @throws PortalException if a acc ins bodies manage sys with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
			getAccInsBodiesManageSys(long accInsBodiesManageSysId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesManageSysLocalService.getAccInsBodiesManageSys(
			accInsBodiesManageSysId);
	}

	/**
	 * Returns the acc ins bodies manage sys matching the UUID and group.
	 *
	 * @param uuid the acc ins bodies manage sys's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc ins bodies manage sys
	 * @throws PortalException if a matching acc ins bodies manage sys could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
			getAccInsBodiesManageSysByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesManageSysLocalService.
			getAccInsBodiesManageSysByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc ins bodies manage syses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesManageSysModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @return the range of acc ins bodies manage syses
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys>
			getAccInsBodiesManageSyses(int start, int end) {

		return _accInsBodiesManageSysLocalService.getAccInsBodiesManageSyses(
			start, end);
	}

	/**
	 * Returns all the acc ins bodies manage syses matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies manage syses
	 * @param companyId the primary key of the company
	 * @return the matching acc ins bodies manage syses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys>
			getAccInsBodiesManageSysesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accInsBodiesManageSysLocalService.
			getAccInsBodiesManageSysesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc ins bodies manage syses matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc ins bodies manage syses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc ins bodies manage syses
	 * @param end the upper bound of the range of acc ins bodies manage syses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc ins bodies manage syses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys>
			getAccInsBodiesManageSysesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccInsBodiesManageSys> orderByComparator) {

		return _accInsBodiesManageSysLocalService.
			getAccInsBodiesManageSysesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc ins bodies manage syses.
	 *
	 * @return the number of acc ins bodies manage syses
	 */
	@Override
	public int getAccInsBodiesManageSysesCount() {
		return _accInsBodiesManageSysLocalService.
			getAccInsBodiesManageSysesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accInsBodiesManageSysLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accInsBodiesManageSysLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accInsBodiesManageSysLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesManageSysException {

		return _accInsBodiesManageSysLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesManageSysLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accInsBodiesManageSysLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc ins bodies manage sys in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccInsBodiesManageSysLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accInsBodiesManageSys the acc ins bodies manage sys
	 * @return the acc ins bodies manage sys that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
		updateAccInsBodiesManageSys(
			com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys
				accInsBodiesManageSys) {

		return _accInsBodiesManageSysLocalService.updateAccInsBodiesManageSys(
			accInsBodiesManageSys);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accInsBodiesManageSysLocalService.getBasePersistence();
	}

	@Override
	public AccInsBodiesManageSysLocalService getWrappedService() {
		return _accInsBodiesManageSysLocalService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesManageSysLocalService accInsBodiesManageSysLocalService) {

		_accInsBodiesManageSysLocalService = accInsBodiesManageSysLocalService;
	}

	private AccInsBodiesManageSysLocalService
		_accInsBodiesManageSysLocalService;

}