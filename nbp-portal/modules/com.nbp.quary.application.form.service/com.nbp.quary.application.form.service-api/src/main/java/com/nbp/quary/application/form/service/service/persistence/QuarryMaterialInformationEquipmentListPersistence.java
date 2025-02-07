/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryMaterialInformationEquipmentListException;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformationEquipmentList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry material information equipment list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentListUtil
 * @generated
 */
@ProviderType
public interface QuarryMaterialInformationEquipmentListPersistence
	extends BasePersistence<QuarryMaterialInformationEquipmentList> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryMaterialInformationEquipmentListUtil} to access the quarry material information equipment list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Returns a range of all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(long quarryApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(
			long quarryApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_ById(
			long quarryApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList findBygetQuarry_ById_First(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList fetchBygetQuarry_ById_First(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryMaterialInformationEquipmentList> orderByComparator);

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList findBygetQuarry_ById_Last(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList fetchBygetQuarry_ById_Last(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryMaterialInformationEquipmentList> orderByComparator);

	/**
	 * Returns the quarry material information equipment lists before and after the current quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param materialInfoId the primary key of the current quarry material information equipment list
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public QuarryMaterialInformationEquipmentList[]
			findBygetQuarry_ById_PrevAndNext(
				long materialInfoId, long quarryApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryMaterialInformationEquipmentList> orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	/**
	 * Removes all the quarry material information equipment lists where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public void removeBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Returns the number of quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry material information equipment lists
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Returns all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @return the matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName);

	/**
	 * Returns a range of all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end);

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList
			findBygetQuarry_By_MachineName_AppId_First(
				long quarryApplicationId, String machineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryMaterialInformationEquipmentList> orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_By_MachineName_AppId_First(
			long quarryApplicationId, String machineName,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator);

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList
			findBygetQuarry_By_MachineName_AppId_Last(
				long quarryApplicationId, String machineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryMaterialInformationEquipmentList> orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	public QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_By_MachineName_AppId_Last(
			long quarryApplicationId, String machineName,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryMaterialInformationEquipmentList> orderByComparator);

	/**
	 * Returns the quarry material information equipment lists before and after the current quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param materialInfoId the primary key of the current quarry material information equipment list
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public QuarryMaterialInformationEquipmentList[]
			findBygetQuarry_By_MachineName_AppId_PrevAndNext(
				long materialInfoId, long quarryApplicationId,
				String machineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryMaterialInformationEquipmentList> orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	/**
	 * Removes all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 */
	public void removeBygetQuarry_By_MachineName_AppId(
		long quarryApplicationId, String machineName);

	/**
	 * Returns the number of quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @return the number of matching quarry material information equipment lists
	 */
	public int countBygetQuarry_By_MachineName_AppId(
		long quarryApplicationId, String machineName);

	/**
	 * Caches the quarry material information equipment list in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 */
	public void cacheResult(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList);

	/**
	 * Caches the quarry material information equipment lists in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformationEquipmentLists the quarry material information equipment lists
	 */
	public void cacheResult(
		java.util.List<QuarryMaterialInformationEquipmentList>
			quarryMaterialInformationEquipmentLists);

	/**
	 * Creates a new quarry material information equipment list with the primary key. Does not add the quarry material information equipment list to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information equipment list
	 * @return the new quarry material information equipment list
	 */
	public QuarryMaterialInformationEquipmentList create(long materialInfoId);

	/**
	 * Removes the quarry material information equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public QuarryMaterialInformationEquipmentList remove(long materialInfoId)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	public QuarryMaterialInformationEquipmentList updateImpl(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList);

	/**
	 * Returns the quarry material information equipment list with the primary key or throws a <code>NoSuchQuarryMaterialInformationEquipmentListException</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	public QuarryMaterialInformationEquipmentList findByPrimaryKey(
			long materialInfoId)
		throws NoSuchQuarryMaterialInformationEquipmentListException;

	/**
	 * Returns the quarry material information equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list, or <code>null</code> if a quarry material information equipment list with the primary key could not be found
	 */
	public QuarryMaterialInformationEquipmentList fetchByPrimaryKey(
		long materialInfoId);

	/**
	 * Returns all the quarry material information equipment lists.
	 *
	 * @return the quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList> findAll();

	/**
	 * Returns a range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @return the range of quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryMaterialInformationEquipmentList> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry material information equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material information equipment lists
	 * @param end the upper bound of the range of quarry material information equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry material information equipment lists
	 */
	public java.util.List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryMaterialInformationEquipmentList> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry material information equipment lists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry material information equipment lists.
	 *
	 * @return the number of quarry material information equipment lists
	 */
	public int countAll();

}