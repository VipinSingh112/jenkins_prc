/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesGeneralBenefitOfCreditorsinfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesGeneralBenefitOfCreditorsinfoLocalService
 * @generated
 */
public class OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceWrapper
	implements OsiServicesGeneralBenefitOfCreditorsinfoLocalService,
			   ServiceWrapper
				   <OsiServicesGeneralBenefitOfCreditorsinfoLocalService> {

	public OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceWrapper(
		OsiServicesGeneralBenefitOfCreditorsinfoLocalService
			osiServicesGeneralBenefitOfCreditorsinfoLocalService) {

		_osiServicesGeneralBenefitOfCreditorsinfoLocalService =
			osiServicesGeneralBenefitOfCreditorsinfoLocalService;
	}

	/**
	 * Adds the osi services general benefit of creditorsinfo to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
			addOsiServicesGeneralBenefitOfCreditorsinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesGeneralBenefitOfCreditorsinfo
						osiServicesGeneralBenefitOfCreditorsinfo) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			addOsiServicesGeneralBenefitOfCreditorsinfo(
				osiServicesGeneralBenefitOfCreditorsinfo);
	}

	/**
	 * Creates a new osi services general benefit of creditorsinfo with the primary key. Does not add the osi services general benefit of creditorsinfo to the database.
	 *
	 * @param osiBOCInsoId the primary key for the new osi services general benefit of creditorsinfo
	 * @return the new osi services general benefit of creditorsinfo
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
			createOsiServicesGeneralBenefitOfCreditorsinfo(long osiBOCInsoId) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			createOsiServicesGeneralBenefitOfCreditorsinfo(osiBOCInsoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi services general benefit of creditorsinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was removed
	 * @throws PortalException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
				deleteOsiServicesGeneralBenefitOfCreditorsinfo(
					long osiBOCInsoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			deleteOsiServicesGeneralBenefitOfCreditorsinfo(osiBOCInsoId);
	}

	/**
	 * Deletes the osi services general benefit of creditorsinfo from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
			deleteOsiServicesGeneralBenefitOfCreditorsinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesGeneralBenefitOfCreditorsinfo
						osiServicesGeneralBenefitOfCreditorsinfo) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			deleteOsiServicesGeneralBenefitOfCreditorsinfo(
				osiServicesGeneralBenefitOfCreditorsinfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			dynamicQuery();
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

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
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

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
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

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			dynamicQuery(dynamicQuery, start, end, orderByComparator);
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

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
			fetchOsiServicesGeneralBenefitOfCreditorsinfo(long osiBOCInsoId) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			fetchOsiServicesGeneralBenefitOfCreditorsinfo(osiBOCInsoId);
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo matching the UUID and group.
	 *
	 * @param uuid the osi services general benefit of creditorsinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
			fetchOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			fetchOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
				uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo with the primary key.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo
	 * @throws PortalException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
				getOsiServicesGeneralBenefitOfCreditorsinfo(long osiBOCInsoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOsiServicesGeneralBenefitOfCreditorsinfo(osiBOCInsoId);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
				getOsiServicesGeneralBenefitOfCreditorsinfoById(
					long osiServicesApplicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOsiServicesGeneralBenefitOfCreditorsinfoById(
				osiServicesApplicationId);
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo matching the UUID and group.
	 *
	 * @param uuid the osi services general benefit of creditorsinfo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services general benefit of creditorsinfo
	 * @throws PortalException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
				getOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOsiServicesGeneralBenefitOfCreditorsinfoByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of osi services general benefit of creditorsinfos
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesGeneralBenefitOfCreditorsinfo>
				getOsiServicesGeneralBenefitOfCreditorsinfos(
					int start, int end) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOsiServicesGeneralBenefitOfCreditorsinfos(start, end);
	}

	/**
	 * Returns all the osi services general benefit of creditorsinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services general benefit of creditorsinfos
	 * @param companyId the primary key of the company
	 * @return the matching osi services general benefit of creditorsinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesGeneralBenefitOfCreditorsinfo>
				getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi services general benefit of creditorsinfos matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services general benefit of creditorsinfos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services general benefit of creditorsinfos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesGeneralBenefitOfCreditorsinfo>
				getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesGeneralBenefitOfCreditorsinfo>
								orderByComparator) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOsiServicesGeneralBenefitOfCreditorsinfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services general benefit of creditorsinfos.
	 *
	 * @return the number of osi services general benefit of creditorsinfos
	 */
	@Override
	public int getOsiServicesGeneralBenefitOfCreditorsinfosCount() {
		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getOsiServicesGeneralBenefitOfCreditorsinfosCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services general benefit of creditorsinfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesGeneralBenefitOfCreditorsinfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesGeneralBenefitOfCreditorsinfo
			updateOsiServicesGeneralBenefitOfCreditorsinfo(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesGeneralBenefitOfCreditorsinfo
						osiServicesGeneralBenefitOfCreditorsinfo) {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			updateOsiServicesGeneralBenefitOfCreditorsinfo(
				osiServicesGeneralBenefitOfCreditorsinfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService.
			getBasePersistence();
	}

	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfoLocalService
		getWrappedService() {

		return _osiServicesGeneralBenefitOfCreditorsinfoLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesGeneralBenefitOfCreditorsinfoLocalService
			osiServicesGeneralBenefitOfCreditorsinfoLocalService) {

		_osiServicesGeneralBenefitOfCreditorsinfoLocalService =
			osiServicesGeneralBenefitOfCreditorsinfoLocalService;
	}

	private OsiServicesGeneralBenefitOfCreditorsinfoLocalService
		_osiServicesGeneralBenefitOfCreditorsinfoLocalService;

}