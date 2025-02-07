/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccCerBodyMngReqTwoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwoLocalService
 * @generated
 */
public class AccCerBodyMngReqTwoLocalServiceWrapper
	implements AccCerBodyMngReqTwoLocalService,
			   ServiceWrapper<AccCerBodyMngReqTwoLocalService> {

	public AccCerBodyMngReqTwoLocalServiceWrapper() {
		this(null);
	}

	public AccCerBodyMngReqTwoLocalServiceWrapper(
		AccCerBodyMngReqTwoLocalService accCerBodyMngReqTwoLocalService) {

		_accCerBodyMngReqTwoLocalService = accCerBodyMngReqTwoLocalService;
	}

	/**
	 * Adds the acc cer body mng req two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwo the acc cer body mng req two
	 * @return the acc cer body mng req two that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
		addAccCerBodyMngReqTwo(
			com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
				accCerBodyMngReqTwo) {

		return _accCerBodyMngReqTwoLocalService.addAccCerBodyMngReqTwo(
			accCerBodyMngReqTwo);
	}

	/**
	 * Creates a new acc cer body mng req two with the primary key. Does not add the acc cer body mng req two to the database.
	 *
	 * @param accCerBodyMngReqTwoId the primary key for the new acc cer body mng req two
	 * @return the new acc cer body mng req two
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
		createAccCerBodyMngReqTwo(long accCerBodyMngReqTwoId) {

		return _accCerBodyMngReqTwoLocalService.createAccCerBodyMngReqTwo(
			accCerBodyMngReqTwoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyMngReqTwoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc cer body mng req two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwo the acc cer body mng req two
	 * @return the acc cer body mng req two that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
		deleteAccCerBodyMngReqTwo(
			com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
				accCerBodyMngReqTwo) {

		return _accCerBodyMngReqTwoLocalService.deleteAccCerBodyMngReqTwo(
			accCerBodyMngReqTwo);
	}

	/**
	 * Deletes the acc cer body mng req two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the acc cer body mng req two
	 * @return the acc cer body mng req two that was removed
	 * @throws PortalException if a acc cer body mng req two with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
			deleteAccCerBodyMngReqTwo(long accCerBodyMngReqTwoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyMngReqTwoLocalService.deleteAccCerBodyMngReqTwo(
			accCerBodyMngReqTwoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyMngReqTwoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accCerBodyMngReqTwoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accCerBodyMngReqTwoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accCerBodyMngReqTwoLocalService.dynamicQuery();
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

		return _accCerBodyMngReqTwoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoModelImpl</code>.
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

		return _accCerBodyMngReqTwoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoModelImpl</code>.
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

		return _accCerBodyMngReqTwoLocalService.dynamicQuery(
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

		return _accCerBodyMngReqTwoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accCerBodyMngReqTwoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
		fetchAccCerBodyMngReqTwo(long accCerBodyMngReqTwoId) {

		return _accCerBodyMngReqTwoLocalService.fetchAccCerBodyMngReqTwo(
			accCerBodyMngReqTwoId);
	}

	/**
	 * Returns the acc cer body mng req two matching the UUID and group.
	 *
	 * @param uuid the acc cer body mng req two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
		fetchAccCerBodyMngReqTwoByUuidAndGroupId(String uuid, long groupId) {

		return _accCerBodyMngReqTwoLocalService.
			fetchAccCerBodyMngReqTwoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc cer body mng req two with the primary key.
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the acc cer body mng req two
	 * @return the acc cer body mng req two
	 * @throws PortalException if a acc cer body mng req two with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
			getAccCerBodyMngReqTwo(long accCerBodyMngReqTwoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyMngReqTwoLocalService.getAccCerBodyMngReqTwo(
			accCerBodyMngReqTwoId);
	}

	/**
	 * Returns the acc cer body mng req two matching the UUID and group.
	 *
	 * @param uuid the acc cer body mng req two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body mng req two
	 * @throws PortalException if a matching acc cer body mng req two could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
			getAccCerBodyMngReqTwoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyMngReqTwoLocalService.
			getAccCerBodyMngReqTwoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body mng req twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @return the range of acc cer body mng req twos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo>
			getAccCerBodyMngReqTwos(int start, int end) {

		return _accCerBodyMngReqTwoLocalService.getAccCerBodyMngReqTwos(
			start, end);
	}

	/**
	 * Returns all the acc cer body mng req twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body mng req twos
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body mng req twos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo>
			getAccCerBodyMngReqTwosByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accCerBodyMngReqTwoLocalService.
			getAccCerBodyMngReqTwosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body mng req twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body mng req twos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body mng req twos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo>
			getAccCerBodyMngReqTwosByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccCerBodyMngReqTwo> orderByComparator) {

		return _accCerBodyMngReqTwoLocalService.
			getAccCerBodyMngReqTwosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body mng req twos.
	 *
	 * @return the number of acc cer body mng req twos
	 */
	@Override
	public int getAccCerBodyMngReqTwosCount() {
		return _accCerBodyMngReqTwoLocalService.getAccCerBodyMngReqTwosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accCerBodyMngReqTwoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accCerBodyMngReqTwoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accCerBodyMngReqTwoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyMngReqTwoException {

		return _accCerBodyMngReqTwoLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyMngReqTwoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyMngReqTwoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acc cer body mng req two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwo the acc cer body mng req two
	 * @return the acc cer body mng req two that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
		updateAccCerBodyMngReqTwo(
			com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo
				accCerBodyMngReqTwo) {

		return _accCerBodyMngReqTwoLocalService.updateAccCerBodyMngReqTwo(
			accCerBodyMngReqTwo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accCerBodyMngReqTwoLocalService.getBasePersistence();
	}

	@Override
	public AccCerBodyMngReqTwoLocalService getWrappedService() {
		return _accCerBodyMngReqTwoLocalService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyMngReqTwoLocalService accCerBodyMngReqTwoLocalService) {

		_accCerBodyMngReqTwoLocalService = accCerBodyMngReqTwoLocalService;
	}

	private AccCerBodyMngReqTwoLocalService _accCerBodyMngReqTwoLocalService;

}