/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryMaterialInformationEquipmentListException;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformationEquipmentList;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformationEquipmentListTable;
import com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationEquipmentListPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationEquipmentListUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the quarry material information equipment list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryMaterialInformationEquipmentListPersistence.class)
public class QuarryMaterialInformationEquipmentListPersistenceImpl
	extends BasePersistenceImpl<QuarryMaterialInformationEquipmentList>
	implements QuarryMaterialInformationEquipmentListPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryMaterialInformationEquipmentListUtil</code> to access the quarry material information equipment list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryMaterialInformationEquipmentListImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetQuarry_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_ById;
	private FinderPath _finderPathCountBygetQuarry_ById;

	/**
	 * Returns all the quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information equipment lists
	 */
	@Override
	public List<QuarryMaterialInformationEquipmentList> findBygetQuarry_ById(
		long quarryApplicationId) {

		return findBygetQuarry_ById(
			quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end) {

		return findBygetQuarry_ById(quarryApplicationId, start, end, null);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator) {

		return findBygetQuarry_ById(
			quarryApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList> findBygetQuarry_ById(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarry_ById;
				finderArgs = new Object[] {quarryApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_ById;
			finderArgs = new Object[] {
				quarryApplicationId, start, end, orderByComparator
			};
		}

		List<QuarryMaterialInformationEquipmentList> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryMaterialInformationEquipmentList>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryMaterialInformationEquipmentList
						quarryMaterialInformationEquipmentList : list) {

					if (quarryApplicationId !=
							quarryMaterialInformationEquipmentList.
								getQuarryApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					QuarryMaterialInformationEquipmentListModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				list =
					(List<QuarryMaterialInformationEquipmentList>)
						QueryUtil.list(query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList findBygetQuarry_ById_First(
			long quarryApplicationId,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList =
				fetchBygetQuarry_ById_First(
					quarryApplicationId, orderByComparator);

		if (quarryMaterialInformationEquipmentList != null) {
			return quarryMaterialInformationEquipmentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryMaterialInformationEquipmentListException(
			sb.toString());
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList fetchBygetQuarry_ById_First(
		long quarryApplicationId,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator) {

		List<QuarryMaterialInformationEquipmentList> list =
			findBygetQuarry_ById(quarryApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList findBygetQuarry_ById_Last(
			long quarryApplicationId,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList = fetchBygetQuarry_ById_Last(
				quarryApplicationId, orderByComparator);

		if (quarryMaterialInformationEquipmentList != null) {
			return quarryMaterialInformationEquipmentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryMaterialInformationEquipmentListException(
			sb.toString());
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList fetchBygetQuarry_ById_Last(
		long quarryApplicationId,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator) {

		int count = countBygetQuarry_ById(quarryApplicationId);

		if (count == 0) {
			return null;
		}

		List<QuarryMaterialInformationEquipmentList> list =
			findBygetQuarry_ById(
				quarryApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry material information equipment lists before and after the current quarry material information equipment list in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param materialInfoId the primary key of the current quarry material information equipment list
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList[]
			findBygetQuarry_ById_PrevAndNext(
				long materialInfoId, long quarryApplicationId,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList = findByPrimaryKey(
				materialInfoId);

		Session session = null;

		try {
			session = openSession();

			QuarryMaterialInformationEquipmentList[] array =
				new QuarryMaterialInformationEquipmentListImpl[3];

			array[0] = getBygetQuarry_ById_PrevAndNext(
				session, quarryMaterialInformationEquipmentList,
				quarryApplicationId, orderByComparator, true);

			array[1] = quarryMaterialInformationEquipmentList;

			array[2] = getBygetQuarry_ById_PrevAndNext(
				session, quarryMaterialInformationEquipmentList,
				quarryApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryMaterialInformationEquipmentList
		getBygetQuarry_ById_PrevAndNext(
			Session session,
			QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList,
			long quarryApplicationId,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE);

		sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				QuarryMaterialInformationEquipmentListModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(quarryApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryMaterialInformationEquipmentList)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryMaterialInformationEquipmentList> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry material information equipment lists where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	@Override
	public void removeBygetQuarry_ById(long quarryApplicationId) {
		for (QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList :
					findBygetQuarry_ById(
						quarryApplicationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(quarryMaterialInformationEquipmentList);
		}
	}

	/**
	 * Returns the number of quarry material information equipment lists where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry material information equipment lists
	 */
	@Override
	public int countBygetQuarry_ById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_ById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2 =
			"quarryMaterialInformationEquipmentList.quarryApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetQuarry_By_MachineName_AppId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetQuarry_By_MachineName_AppId;
	private FinderPath _finderPathCountBygetQuarry_By_MachineName_AppId;

	/**
	 * Returns all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @return the matching quarry material information equipment lists
	 */
	@Override
	public List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName) {

		return findBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end) {

		return findBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName, start, end, null);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		return findBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName, start, end, orderByComparator,
			true);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList>
		findBygetQuarry_By_MachineName_AppId(
			long quarryApplicationId, String machineName, int start, int end,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator,
			boolean useFinderCache) {

		machineName = Objects.toString(machineName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarry_By_MachineName_AppId;
				finderArgs = new Object[] {quarryApplicationId, machineName};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetQuarry_By_MachineName_AppId;
			finderArgs = new Object[] {
				quarryApplicationId, machineName, start, end, orderByComparator
			};
		}

		List<QuarryMaterialInformationEquipmentList> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryMaterialInformationEquipmentList>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryMaterialInformationEquipmentList
						quarryMaterialInformationEquipmentList : list) {

					if ((quarryApplicationId !=
							quarryMaterialInformationEquipmentList.
								getQuarryApplicationId()) ||
						!machineName.equals(
							quarryMaterialInformationEquipmentList.
								getMachineName())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE);

			sb.append(
				_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);

			boolean bindMachineName = false;

			if (machineName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_3);
			}
			else {
				bindMachineName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					QuarryMaterialInformationEquipmentListModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				if (bindMachineName) {
					queryPos.add(machineName);
				}

				list =
					(List<QuarryMaterialInformationEquipmentList>)
						QueryUtil.list(query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList
			findBygetQuarry_By_MachineName_AppId_First(
				long quarryApplicationId, String machineName,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList =
				fetchBygetQuarry_By_MachineName_AppId_First(
					quarryApplicationId, machineName, orderByComparator);

		if (quarryMaterialInformationEquipmentList != null) {
			return quarryMaterialInformationEquipmentList;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append(", machineName=");
		sb.append(machineName);

		sb.append("}");

		throw new NoSuchQuarryMaterialInformationEquipmentListException(
			sb.toString());
	}

	/**
	 * Returns the first quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_By_MachineName_AppId_First(
			long quarryApplicationId, String machineName,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		List<QuarryMaterialInformationEquipmentList> list =
			findBygetQuarry_By_MachineName_AppId(
				quarryApplicationId, machineName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList
			findBygetQuarry_By_MachineName_AppId_Last(
				long quarryApplicationId, String machineName,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList =
				fetchBygetQuarry_By_MachineName_AppId_Last(
					quarryApplicationId, machineName, orderByComparator);

		if (quarryMaterialInformationEquipmentList != null) {
			return quarryMaterialInformationEquipmentList;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append(", machineName=");
		sb.append(machineName);

		sb.append("}");

		throw new NoSuchQuarryMaterialInformationEquipmentListException(
			sb.toString());
	}

	/**
	 * Returns the last quarry material information equipment list in the ordered set where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry material information equipment list, or <code>null</code> if a matching quarry material information equipment list could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList
		fetchBygetQuarry_By_MachineName_AppId_Last(
			long quarryApplicationId, String machineName,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator) {

		int count = countBygetQuarry_By_MachineName_AppId(
			quarryApplicationId, machineName);

		if (count == 0) {
			return null;
		}

		List<QuarryMaterialInformationEquipmentList> list =
			findBygetQuarry_By_MachineName_AppId(
				quarryApplicationId, machineName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public QuarryMaterialInformationEquipmentList[]
			findBygetQuarry_By_MachineName_AppId_PrevAndNext(
				long materialInfoId, long quarryApplicationId,
				String machineName,
				OrderByComparator<QuarryMaterialInformationEquipmentList>
					orderByComparator)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		machineName = Objects.toString(machineName, "");

		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList = findByPrimaryKey(
				materialInfoId);

		Session session = null;

		try {
			session = openSession();

			QuarryMaterialInformationEquipmentList[] array =
				new QuarryMaterialInformationEquipmentListImpl[3];

			array[0] = getBygetQuarry_By_MachineName_AppId_PrevAndNext(
				session, quarryMaterialInformationEquipmentList,
				quarryApplicationId, machineName, orderByComparator, true);

			array[1] = quarryMaterialInformationEquipmentList;

			array[2] = getBygetQuarry_By_MachineName_AppId_PrevAndNext(
				session, quarryMaterialInformationEquipmentList,
				quarryApplicationId, machineName, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryMaterialInformationEquipmentList
		getBygetQuarry_By_MachineName_AppId_PrevAndNext(
			Session session,
			QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList,
			long quarryApplicationId, String machineName,
			OrderByComparator<QuarryMaterialInformationEquipmentList>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE);

		sb.append(
			_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);

		boolean bindMachineName = false;

		if (machineName.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_3);
		}
		else {
			bindMachineName = true;

			sb.append(
				_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(
				QuarryMaterialInformationEquipmentListModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(quarryApplicationId);

		if (bindMachineName) {
			queryPos.add(machineName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryMaterialInformationEquipmentList)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryMaterialInformationEquipmentList> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 */
	@Override
	public void removeBygetQuarry_By_MachineName_AppId(
		long quarryApplicationId, String machineName) {

		for (QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList :
					findBygetQuarry_By_MachineName_AppId(
						quarryApplicationId, machineName, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(quarryMaterialInformationEquipmentList);
		}
	}

	/**
	 * Returns the number of quarry material information equipment lists where quarryApplicationId = &#63; and machineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param machineName the machine name
	 * @return the number of matching quarry material information equipment lists
	 */
	@Override
	public int countBygetQuarry_By_MachineName_AppId(
		long quarryApplicationId, String machineName) {

		machineName = Objects.toString(machineName, "");

		FinderPath finderPath =
			_finderPathCountBygetQuarry_By_MachineName_AppId;

		Object[] finderArgs = new Object[] {quarryApplicationId, machineName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE);

			sb.append(
				_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2);

			boolean bindMachineName = false;

			if (machineName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_3);
			}
			else {
				bindMachineName = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				if (bindMachineName) {
					queryPos.add(machineName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_QUARRYAPPLICATIONID_2 =
			"quarryMaterialInformationEquipmentList.quarryApplicationId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_2 =
			"quarryMaterialInformationEquipmentList.machineName = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_MACHINENAME_APPID_MACHINENAME_3 =
			"(quarryMaterialInformationEquipmentList.machineName IS NULL OR quarryMaterialInformationEquipmentList.machineName = '')";

	public QuarryMaterialInformationEquipmentListPersistenceImpl() {
		setModelClass(QuarryMaterialInformationEquipmentList.class);

		setModelImplClass(QuarryMaterialInformationEquipmentListImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryMaterialInformationEquipmentListTable.INSTANCE);
	}

	/**
	 * Caches the quarry material information equipment list in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformationEquipmentList the quarry material information equipment list
	 */
	@Override
	public void cacheResult(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		entityCache.putResult(
			QuarryMaterialInformationEquipmentListImpl.class,
			quarryMaterialInformationEquipmentList.getPrimaryKey(),
			quarryMaterialInformationEquipmentList);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry material information equipment lists in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformationEquipmentLists the quarry material information equipment lists
	 */
	@Override
	public void cacheResult(
		List<QuarryMaterialInformationEquipmentList>
			quarryMaterialInformationEquipmentLists) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryMaterialInformationEquipmentLists.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList :
					quarryMaterialInformationEquipmentLists) {

			if (entityCache.getResult(
					QuarryMaterialInformationEquipmentListImpl.class,
					quarryMaterialInformationEquipmentList.getPrimaryKey()) ==
						null) {

				cacheResult(quarryMaterialInformationEquipmentList);
			}
		}
	}

	/**
	 * Clears the cache for all quarry material information equipment lists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			QuarryMaterialInformationEquipmentListImpl.class);

		finderCache.clearCache(
			QuarryMaterialInformationEquipmentListImpl.class);
	}

	/**
	 * Clears the cache for the quarry material information equipment list.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		entityCache.removeResult(
			QuarryMaterialInformationEquipmentListImpl.class,
			quarryMaterialInformationEquipmentList);
	}

	@Override
	public void clearCache(
		List<QuarryMaterialInformationEquipmentList>
			quarryMaterialInformationEquipmentLists) {

		for (QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList :
					quarryMaterialInformationEquipmentLists) {

			entityCache.removeResult(
				QuarryMaterialInformationEquipmentListImpl.class,
				quarryMaterialInformationEquipmentList);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			QuarryMaterialInformationEquipmentListImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryMaterialInformationEquipmentListImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new quarry material information equipment list with the primary key. Does not add the quarry material information equipment list to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information equipment list
	 * @return the new quarry material information equipment list
	 */
	@Override
	public QuarryMaterialInformationEquipmentList create(long materialInfoId) {
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList =
				new QuarryMaterialInformationEquipmentListImpl();

		quarryMaterialInformationEquipmentList.setNew(true);
		quarryMaterialInformationEquipmentList.setPrimaryKey(materialInfoId);

		quarryMaterialInformationEquipmentList.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryMaterialInformationEquipmentList;
	}

	/**
	 * Removes the quarry material information equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList remove(long materialInfoId)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		return remove((Serializable)materialInfoId);
	}

	/**
	 * Removes the quarry material information equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list that was removed
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList remove(
			Serializable primaryKey)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		Session session = null;

		try {
			session = openSession();

			QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList =
					(QuarryMaterialInformationEquipmentList)session.get(
						QuarryMaterialInformationEquipmentListImpl.class,
						primaryKey);

			if (quarryMaterialInformationEquipmentList == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryMaterialInformationEquipmentListException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryMaterialInformationEquipmentList);
		}
		catch (NoSuchQuarryMaterialInformationEquipmentListException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected QuarryMaterialInformationEquipmentList removeImpl(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryMaterialInformationEquipmentList)) {
				quarryMaterialInformationEquipmentList =
					(QuarryMaterialInformationEquipmentList)session.get(
						QuarryMaterialInformationEquipmentListImpl.class,
						quarryMaterialInformationEquipmentList.
							getPrimaryKeyObj());
			}

			if (quarryMaterialInformationEquipmentList != null) {
				session.delete(quarryMaterialInformationEquipmentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryMaterialInformationEquipmentList != null) {
			clearCache(quarryMaterialInformationEquipmentList);
		}

		return quarryMaterialInformationEquipmentList;
	}

	@Override
	public QuarryMaterialInformationEquipmentList updateImpl(
		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList) {

		boolean isNew = quarryMaterialInformationEquipmentList.isNew();

		if (!(quarryMaterialInformationEquipmentList instanceof
				QuarryMaterialInformationEquipmentListModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					quarryMaterialInformationEquipmentList.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryMaterialInformationEquipmentList);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryMaterialInformationEquipmentList proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryMaterialInformationEquipmentList implementation " +
					quarryMaterialInformationEquipmentList.getClass());
		}

		QuarryMaterialInformationEquipmentListModelImpl
			quarryMaterialInformationEquipmentListModelImpl =
				(QuarryMaterialInformationEquipmentListModelImpl)
					quarryMaterialInformationEquipmentList;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(quarryMaterialInformationEquipmentList.getCreateDate() == null)) {

			if (serviceContext == null) {
				quarryMaterialInformationEquipmentList.setCreateDate(date);
			}
			else {
				quarryMaterialInformationEquipmentList.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryMaterialInformationEquipmentListModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				quarryMaterialInformationEquipmentList.setModifiedDate(date);
			}
			else {
				quarryMaterialInformationEquipmentList.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryMaterialInformationEquipmentList);
			}
			else {
				quarryMaterialInformationEquipmentList =
					(QuarryMaterialInformationEquipmentList)session.merge(
						quarryMaterialInformationEquipmentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryMaterialInformationEquipmentListImpl.class,
			quarryMaterialInformationEquipmentListModelImpl, false, true);

		if (isNew) {
			quarryMaterialInformationEquipmentList.setNew(false);
		}

		quarryMaterialInformationEquipmentList.resetOriginalValues();

		return quarryMaterialInformationEquipmentList;
	}

	/**
	 * Returns the quarry material information equipment list with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		QuarryMaterialInformationEquipmentList
			quarryMaterialInformationEquipmentList = fetchByPrimaryKey(
				primaryKey);

		if (quarryMaterialInformationEquipmentList == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryMaterialInformationEquipmentListException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryMaterialInformationEquipmentList;
	}

	/**
	 * Returns the quarry material information equipment list with the primary key or throws a <code>NoSuchQuarryMaterialInformationEquipmentListException</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list
	 * @throws NoSuchQuarryMaterialInformationEquipmentListException if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList findByPrimaryKey(
			long materialInfoId)
		throws NoSuchQuarryMaterialInformationEquipmentListException {

		return findByPrimaryKey((Serializable)materialInfoId);
	}

	/**
	 * Returns the quarry material information equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information equipment list
	 * @return the quarry material information equipment list, or <code>null</code> if a quarry material information equipment list with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformationEquipmentList fetchByPrimaryKey(
		long materialInfoId) {

		return fetchByPrimaryKey((Serializable)materialInfoId);
	}

	/**
	 * Returns all the quarry material information equipment lists.
	 *
	 * @return the quarry material information equipment lists
	 */
	@Override
	public List<QuarryMaterialInformationEquipmentList> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<QuarryMaterialInformationEquipmentList> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformationEquipmentList>
			orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<QuarryMaterialInformationEquipmentList> list = null;

		if (useFinderCache) {
			list =
				(List<QuarryMaterialInformationEquipmentList>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST;

				sql = sql.concat(
					QuarryMaterialInformationEquipmentListModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<QuarryMaterialInformationEquipmentList>)
						QueryUtil.list(query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the quarry material information equipment lists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryMaterialInformationEquipmentList
				quarryMaterialInformationEquipmentList : findAll()) {

			remove(quarryMaterialInformationEquipmentList);
		}
	}

	/**
	 * Returns the number of quarry material information equipment lists.
	 *
	 * @return the number of quarry material information equipment lists
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "materialInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryMaterialInformationEquipmentListModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry material information equipment list persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarry_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"quarryApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		_finderPathWithPaginationFindBygetQuarry_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetQuarry_By_MachineName_AppId",
				new String[] {
					Long.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"quarryApplicationId", "machineName"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_By_MachineName_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarry_By_MachineName_AppId",
				new String[] {Long.class.getName(), String.class.getName()},
				new String[] {"quarryApplicationId", "machineName"}, true);

		_finderPathCountBygetQuarry_By_MachineName_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_By_MachineName_AppId",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"quarryApplicationId", "machineName"}, false);

		QuarryMaterialInformationEquipmentListUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryMaterialInformationEquipmentListUtil.setPersistence(null);

		entityCache.removeCache(
			QuarryMaterialInformationEquipmentListImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST =
			"SELECT quarryMaterialInformationEquipmentList FROM QuarryMaterialInformationEquipmentList quarryMaterialInformationEquipmentList";

	private static final String
		_SQL_SELECT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE =
			"SELECT quarryMaterialInformationEquipmentList FROM QuarryMaterialInformationEquipmentList quarryMaterialInformationEquipmentList WHERE ";

	private static final String
		_SQL_COUNT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST =
			"SELECT COUNT(quarryMaterialInformationEquipmentList) FROM QuarryMaterialInformationEquipmentList quarryMaterialInformationEquipmentList";

	private static final String
		_SQL_COUNT_QUARRYMATERIALINFORMATIONEQUIPMENTLIST_WHERE =
			"SELECT COUNT(quarryMaterialInformationEquipmentList) FROM QuarryMaterialInformationEquipmentList quarryMaterialInformationEquipmentList WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryMaterialInformationEquipmentList.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryMaterialInformationEquipmentList exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryMaterialInformationEquipmentList exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryMaterialInformationEquipmentListPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}