/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddCraftEmployeeInfoException;
import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;
import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfoTable;
import com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddCraftEmployeeInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddCraftEmployeeInfoUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the jtb add craft employee info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JtbAddCraftEmployeeInfoPersistence.class)
public class JtbAddCraftEmployeeInfoPersistenceImpl
	extends BasePersistenceImpl<JtbAddCraftEmployeeInfo>
	implements JtbAddCraftEmployeeInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbAddCraftEmployeeInfoUtil</code> to access the jtb add craft employee info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbAddCraftEmployeeInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetByJtbAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetByJtbAppId;
	private FinderPath _finderPathCountBygetByJtbAppId;

	/**
	 * Returns all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId) {

		return findBygetByJtbAppId(
			jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @return the range of matching jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return findBygetByJtbAppId(jtbApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator) {

		return findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetByJtbAppId;
				finderArgs = new Object[] {jtbApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetByJtbAppId;
			finderArgs = new Object[] {
				jtbApplicationId, start, end, orderByComparator
			};
		}

		List<JtbAddCraftEmployeeInfo> list = null;

		if (useFinderCache) {
			list = (List<JtbAddCraftEmployeeInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo : list) {
					if (jtbApplicationId !=
							jtbAddCraftEmployeeInfo.getJtbApplicationId()) {

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

			sb.append(_SQL_SELECT_JTBADDCRAFTEMPLOYEEINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbAddCraftEmployeeInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				list = (List<JtbAddCraftEmployeeInfo>)QueryUtil.list(
					query, getDialect(), start, end);

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
	 * Returns the first jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a matching jtb add craft employee info could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator)
		throws NoSuchJtbAddCraftEmployeeInfoException {

		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo =
			fetchBygetByJtbAppId_First(jtbApplicationId, orderByComparator);

		if (jtbAddCraftEmployeeInfo != null) {
			return jtbAddCraftEmployeeInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddCraftEmployeeInfoException(sb.toString());
	}

	/**
	 * Returns the first jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft employee info, or <code>null</code> if a matching jtb add craft employee info could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator) {

		List<JtbAddCraftEmployeeInfo> list = findBygetByJtbAppId(
			jtbApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a matching jtb add craft employee info could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator)
		throws NoSuchJtbAddCraftEmployeeInfoException {

		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo =
			fetchBygetByJtbAppId_Last(jtbApplicationId, orderByComparator);

		if (jtbAddCraftEmployeeInfo != null) {
			return jtbAddCraftEmployeeInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddCraftEmployeeInfoException(sb.toString());
	}

	/**
	 * Returns the last jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft employee info, or <code>null</code> if a matching jtb add craft employee info could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator) {

		int count = countBygetByJtbAppId(jtbApplicationId);

		if (count == 0) {
			return null;
		}

		List<JtbAddCraftEmployeeInfo> list = findBygetByJtbAppId(
			jtbApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb add craft employee infos before and after the current jtb add craft employee info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the current jtb add craft employee info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddCraftEmployeeInfoId, long jtbApplicationId,
			OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator)
		throws NoSuchJtbAddCraftEmployeeInfoException {

		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo = findByPrimaryKey(
			jtbAddCraftEmployeeInfoId);

		Session session = null;

		try {
			session = openSession();

			JtbAddCraftEmployeeInfo[] array =
				new JtbAddCraftEmployeeInfoImpl[3];

			array[0] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddCraftEmployeeInfo, jtbApplicationId,
				orderByComparator, true);

			array[1] = jtbAddCraftEmployeeInfo;

			array[2] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddCraftEmployeeInfo, jtbApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JtbAddCraftEmployeeInfo getBygetByJtbAppId_PrevAndNext(
		Session session, JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo,
		long jtbApplicationId,
		OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBADDCRAFTEMPLOYEEINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

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
			sb.append(JtbAddCraftEmployeeInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(jtbApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jtbAddCraftEmployeeInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbAddCraftEmployeeInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb add craft employee infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	@Override
	public void removeBygetByJtbAppId(long jtbApplicationId) {
		for (JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo :
				findBygetByJtbAppId(
					jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbAddCraftEmployeeInfo);
		}
	}

	/**
	 * Returns the number of jtb add craft employee infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add craft employee infos
	 */
	@Override
	public int countBygetByJtbAppId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByJtbAppId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBADDCRAFTEMPLOYEEINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2 =
			"jtbAddCraftEmployeeInfo.jtbApplicationId = ?";

	public JtbAddCraftEmployeeInfoPersistenceImpl() {
		setModelClass(JtbAddCraftEmployeeInfo.class);

		setModelImplClass(JtbAddCraftEmployeeInfoImpl.class);
		setModelPKClass(long.class);

		setTable(JtbAddCraftEmployeeInfoTable.INSTANCE);
	}

	/**
	 * Caches the jtb add craft employee info in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 */
	@Override
	public void cacheResult(JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {
		entityCache.putResult(
			JtbAddCraftEmployeeInfoImpl.class,
			jtbAddCraftEmployeeInfo.getPrimaryKey(), jtbAddCraftEmployeeInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb add craft employee infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftEmployeeInfos the jtb add craft employee infos
	 */
	@Override
	public void cacheResult(
		List<JtbAddCraftEmployeeInfo> jtbAddCraftEmployeeInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbAddCraftEmployeeInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo :
				jtbAddCraftEmployeeInfos) {

			if (entityCache.getResult(
					JtbAddCraftEmployeeInfoImpl.class,
					jtbAddCraftEmployeeInfo.getPrimaryKey()) == null) {

				cacheResult(jtbAddCraftEmployeeInfo);
			}
		}
	}

	/**
	 * Clears the cache for all jtb add craft employee infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbAddCraftEmployeeInfoImpl.class);

		finderCache.clearCache(JtbAddCraftEmployeeInfoImpl.class);
	}

	/**
	 * Clears the cache for the jtb add craft employee info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {
		entityCache.removeResult(
			JtbAddCraftEmployeeInfoImpl.class, jtbAddCraftEmployeeInfo);
	}

	@Override
	public void clearCache(
		List<JtbAddCraftEmployeeInfo> jtbAddCraftEmployeeInfos) {

		for (JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo :
				jtbAddCraftEmployeeInfos) {

			entityCache.removeResult(
				JtbAddCraftEmployeeInfoImpl.class, jtbAddCraftEmployeeInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbAddCraftEmployeeInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JtbAddCraftEmployeeInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new jtb add craft employee info with the primary key. Does not add the jtb add craft employee info to the database.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key for the new jtb add craft employee info
	 * @return the new jtb add craft employee info
	 */
	@Override
	public JtbAddCraftEmployeeInfo create(long jtbAddCraftEmployeeInfoId) {
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo =
			new JtbAddCraftEmployeeInfoImpl();

		jtbAddCraftEmployeeInfo.setNew(true);
		jtbAddCraftEmployeeInfo.setPrimaryKey(jtbAddCraftEmployeeInfoId);

		jtbAddCraftEmployeeInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbAddCraftEmployeeInfo;
	}

	/**
	 * Removes the jtb add craft employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info that was removed
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo remove(long jtbAddCraftEmployeeInfoId)
		throws NoSuchJtbAddCraftEmployeeInfoException {

		return remove((Serializable)jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Removes the jtb add craft employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info that was removed
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo remove(Serializable primaryKey)
		throws NoSuchJtbAddCraftEmployeeInfoException {

		Session session = null;

		try {
			session = openSession();

			JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo =
				(JtbAddCraftEmployeeInfo)session.get(
					JtbAddCraftEmployeeInfoImpl.class, primaryKey);

			if (jtbAddCraftEmployeeInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbAddCraftEmployeeInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbAddCraftEmployeeInfo);
		}
		catch (NoSuchJtbAddCraftEmployeeInfoException noSuchEntityException) {
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
	protected JtbAddCraftEmployeeInfo removeImpl(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbAddCraftEmployeeInfo)) {
				jtbAddCraftEmployeeInfo = (JtbAddCraftEmployeeInfo)session.get(
					JtbAddCraftEmployeeInfoImpl.class,
					jtbAddCraftEmployeeInfo.getPrimaryKeyObj());
			}

			if (jtbAddCraftEmployeeInfo != null) {
				session.delete(jtbAddCraftEmployeeInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbAddCraftEmployeeInfo != null) {
			clearCache(jtbAddCraftEmployeeInfo);
		}

		return jtbAddCraftEmployeeInfo;
	}

	@Override
	public JtbAddCraftEmployeeInfo updateImpl(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {

		boolean isNew = jtbAddCraftEmployeeInfo.isNew();

		if (!(jtbAddCraftEmployeeInfo instanceof
				JtbAddCraftEmployeeInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbAddCraftEmployeeInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbAddCraftEmployeeInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbAddCraftEmployeeInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbAddCraftEmployeeInfo implementation " +
					jtbAddCraftEmployeeInfo.getClass());
		}

		JtbAddCraftEmployeeInfoModelImpl jtbAddCraftEmployeeInfoModelImpl =
			(JtbAddCraftEmployeeInfoModelImpl)jtbAddCraftEmployeeInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbAddCraftEmployeeInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbAddCraftEmployeeInfo.setCreateDate(date);
			}
			else {
				jtbAddCraftEmployeeInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbAddCraftEmployeeInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbAddCraftEmployeeInfo.setModifiedDate(date);
			}
			else {
				jtbAddCraftEmployeeInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbAddCraftEmployeeInfo);
			}
			else {
				jtbAddCraftEmployeeInfo =
					(JtbAddCraftEmployeeInfo)session.merge(
						jtbAddCraftEmployeeInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbAddCraftEmployeeInfoImpl.class, jtbAddCraftEmployeeInfoModelImpl,
			false, true);

		if (isNew) {
			jtbAddCraftEmployeeInfo.setNew(false);
		}

		jtbAddCraftEmployeeInfo.resetOriginalValues();

		return jtbAddCraftEmployeeInfo;
	}

	/**
	 * Returns the jtb add craft employee info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbAddCraftEmployeeInfoException {

		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo = fetchByPrimaryKey(
			primaryKey);

		if (jtbAddCraftEmployeeInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbAddCraftEmployeeInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbAddCraftEmployeeInfo;
	}

	/**
	 * Returns the jtb add craft employee info with the primary key or throws a <code>NoSuchJtbAddCraftEmployeeInfoException</code> if it could not be found.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info
	 * @throws NoSuchJtbAddCraftEmployeeInfoException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo findByPrimaryKey(
			long jtbAddCraftEmployeeInfoId)
		throws NoSuchJtbAddCraftEmployeeInfoException {

		return findByPrimaryKey((Serializable)jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Returns the jtb add craft employee info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info, or <code>null</code> if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo fetchByPrimaryKey(
		long jtbAddCraftEmployeeInfoId) {

		return fetchByPrimaryKey((Serializable)jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Returns all the jtb add craft employee infos.
	 *
	 * @return the jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @return the range of jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddCraftEmployeeInfo> orderByComparator,
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

		List<JtbAddCraftEmployeeInfo> list = null;

		if (useFinderCache) {
			list = (List<JtbAddCraftEmployeeInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBADDCRAFTEMPLOYEEINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBADDCRAFTEMPLOYEEINFO;

				sql = sql.concat(
					JtbAddCraftEmployeeInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbAddCraftEmployeeInfo>)QueryUtil.list(
					query, getDialect(), start, end);

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
	 * Removes all the jtb add craft employee infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo : findAll()) {
			remove(jtbAddCraftEmployeeInfo);
		}
	}

	/**
	 * Returns the number of jtb add craft employee infos.
	 *
	 * @return the number of jtb add craft employee infos
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
					_SQL_COUNT_JTBADDCRAFTEMPLOYEEINFO);

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
		return "jtbAddCraftEmployeeInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBADDCRAFTEMPLOYEEINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbAddCraftEmployeeInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb add craft employee info persistence.
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

		_finderPathWithPaginationFindBygetByJtbAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetByJtbAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"jtbApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetByJtbAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetByJtbAppId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetByJtbAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByJtbAppId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		JtbAddCraftEmployeeInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JtbAddCraftEmployeeInfoUtil.setPersistence(null);

		entityCache.removeCache(JtbAddCraftEmployeeInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBADDCRAFTEMPLOYEEINFO =
		"SELECT jtbAddCraftEmployeeInfo FROM JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo";

	private static final String _SQL_SELECT_JTBADDCRAFTEMPLOYEEINFO_WHERE =
		"SELECT jtbAddCraftEmployeeInfo FROM JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo WHERE ";

	private static final String _SQL_COUNT_JTBADDCRAFTEMPLOYEEINFO =
		"SELECT COUNT(jtbAddCraftEmployeeInfo) FROM JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo";

	private static final String _SQL_COUNT_JTBADDCRAFTEMPLOYEEINFO_WHERE =
		"SELECT COUNT(jtbAddCraftEmployeeInfo) FROM JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbAddCraftEmployeeInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbAddCraftEmployeeInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbAddCraftEmployeeInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbAddCraftEmployeeInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}