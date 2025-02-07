/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.entity.information.services.model.EntityInformation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for EntityInformation. This utility wraps
 * <code>com.nbp.entity.information.services.service.impl.EntityInformationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformationLocalService
 * @generated
 */
public class EntityInformationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.entity.information.services.service.impl.EntityInformationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the entity information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInformation the entity information
	 * @return the entity information that was added
	 */
	public static EntityInformation addEntityInformation(
		EntityInformation entityInformation) {

		return getService().addEntityInformation(entityInformation);
	}

	/**
	 * Creates a new entity information with the primary key. Does not add the entity information to the database.
	 *
	 * @param entityInfoId the primary key for the new entity information
	 * @return the new entity information
	 */
	public static EntityInformation createEntityInformation(long entityInfoId) {
		return getService().createEntityInformation(entityInfoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the entity information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInformation the entity information
	 * @return the entity information that was removed
	 */
	public static EntityInformation deleteEntityInformation(
		EntityInformation entityInformation) {

		return getService().deleteEntityInformation(entityInformation);
	}

	/**
	 * Deletes the entity information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information that was removed
	 * @throws PortalException if a entity information with the primary key could not be found
	 */
	public static EntityInformation deleteEntityInformation(long entityInfoId)
		throws PortalException {

		return getService().deleteEntityInformation(entityInfoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.entity.information.services.model.impl.EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.entity.information.services.model.impl.EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static EntityInformation fetchEntityInformation(long entityInfoId) {
		return getService().fetchEntityInformation(entityInfoId);
	}

	/**
	 * Returns the entity information matching the UUID and group.
	 *
	 * @param uuid the entity information's UUID
	 * @param groupId the primary key of the group
	 * @return the matching entity information, or <code>null</code> if a matching entity information could not be found
	 */
	public static EntityInformation fetchEntityInformationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchEntityInformationByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the entity information with the primary key.
	 *
	 * @param entityInfoId the primary key of the entity information
	 * @return the entity information
	 * @throws PortalException if a entity information with the primary key could not be found
	 */
	public static EntityInformation getEntityInformation(long entityInfoId)
		throws PortalException {

		return getService().getEntityInformation(entityInfoId);
	}

	public static EntityInformation getEntityInformationByEntityNumber(
			String entityNumber)
		throws com.nbp.entity.information.services.exception.
			NoSuchEntityInformationException {

		return getService().getEntityInformationByEntityNumber(entityNumber);
	}

	/**
	 * Returns the entity information matching the UUID and group.
	 *
	 * @param uuid the entity information's UUID
	 * @param groupId the primary key of the group
	 * @return the matching entity information
	 * @throws PortalException if a matching entity information could not be found
	 */
	public static EntityInformation getEntityInformationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getEntityInformationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the entity informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.entity.information.services.model.impl.EntityInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @return the range of entity informations
	 */
	public static List<EntityInformation> getEntityInformations(
		int start, int end) {

		return getService().getEntityInformations(start, end);
	}

	/**
	 * Returns all the entity informations matching the UUID and company.
	 *
	 * @param uuid the UUID of the entity informations
	 * @param companyId the primary key of the company
	 * @return the matching entity informations, or an empty list if no matches were found
	 */
	public static List<EntityInformation>
		getEntityInformationsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getEntityInformationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of entity informations matching the UUID and company.
	 *
	 * @param uuid the UUID of the entity informations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of entity informations
	 * @param end the upper bound of the range of entity informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching entity informations, or an empty list if no matches were found
	 */
	public static List<EntityInformation>
		getEntityInformationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<EntityInformation> orderByComparator) {

		return getService().getEntityInformationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of entity informations.
	 *
	 * @return the number of entity informations
	 */
	public static int getEntityInformationsCount() {
		return getService().getEntityInformationsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the entity information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntityInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entityInformation the entity information
	 * @return the entity information that was updated
	 */
	public static EntityInformation updateEntityInformation(
		EntityInformation entityInformation) {

		return getService().updateEntityInformation(entityInformation);
	}

	public static EntityInformationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<EntityInformationLocalService>
		_serviceSnapshot = new Snapshot<>(
			EntityInformationLocalServiceUtil.class,
			EntityInformationLocalService.class);

}