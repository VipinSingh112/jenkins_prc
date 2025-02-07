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

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddListDriverInfoException;
import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;
import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfoTable;
import com.nbp.jtb.application.form.service.model.impl.JtbAddListDriverInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.JtbAddListDriverInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddListDriverInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddListDriverInfoUtil;
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
 * The persistence implementation for the jtb add list driver info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JtbAddListDriverInfoPersistence.class)
public class JtbAddListDriverInfoPersistenceImpl
	extends BasePersistenceImpl<JtbAddListDriverInfo>
	implements JtbAddListDriverInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbAddListDriverInfoUtil</code> to access the jtb add list driver info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbAddListDriverInfoImpl.class.getName();

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
	 * Returns all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId) {

		return findBygetByJtbAppId(
			jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @return the range of matching jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return findBygetByJtbAppId(jtbApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		return findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator,
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

		List<JtbAddListDriverInfo> list = null;

		if (useFinderCache) {
			list = (List<JtbAddListDriverInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbAddListDriverInfo jtbAddListDriverInfo : list) {
					if (jtbApplicationId !=
							jtbAddListDriverInfo.getJtbApplicationId()) {

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

			sb.append(_SQL_SELECT_JTBADDLISTDRIVERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbAddListDriverInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				list = (List<JtbAddListDriverInfo>)QueryUtil.list(
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
	 * Returns the first jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a matching jtb add list driver info could not be found
	 */
	@Override
	public JtbAddListDriverInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddListDriverInfo> orderByComparator)
		throws NoSuchJtbAddListDriverInfoException {

		JtbAddListDriverInfo jtbAddListDriverInfo = fetchBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);

		if (jtbAddListDriverInfo != null) {
			return jtbAddListDriverInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddListDriverInfoException(sb.toString());
	}

	/**
	 * Returns the first jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list driver info, or <code>null</code> if a matching jtb add list driver info could not be found
	 */
	@Override
	public JtbAddListDriverInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		List<JtbAddListDriverInfo> list = findBygetByJtbAppId(
			jtbApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a matching jtb add list driver info could not be found
	 */
	@Override
	public JtbAddListDriverInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddListDriverInfo> orderByComparator)
		throws NoSuchJtbAddListDriverInfoException {

		JtbAddListDriverInfo jtbAddListDriverInfo = fetchBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);

		if (jtbAddListDriverInfo != null) {
			return jtbAddListDriverInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddListDriverInfoException(sb.toString());
	}

	/**
	 * Returns the last jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list driver info, or <code>null</code> if a matching jtb add list driver info could not be found
	 */
	@Override
	public JtbAddListDriverInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		int count = countBygetByJtbAppId(jtbApplicationId);

		if (count == 0) {
			return null;
		}

		List<JtbAddListDriverInfo> list = findBygetByJtbAppId(
			jtbApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb add list driver infos before and after the current jtb add list driver info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the current jtb add list driver info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public JtbAddListDriverInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddListDriverInfoId, long jtbApplicationId,
			OrderByComparator<JtbAddListDriverInfo> orderByComparator)
		throws NoSuchJtbAddListDriverInfoException {

		JtbAddListDriverInfo jtbAddListDriverInfo = findByPrimaryKey(
			jtbAddListDriverInfoId);

		Session session = null;

		try {
			session = openSession();

			JtbAddListDriverInfo[] array = new JtbAddListDriverInfoImpl[3];

			array[0] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddListDriverInfo, jtbApplicationId,
				orderByComparator, true);

			array[1] = jtbAddListDriverInfo;

			array[2] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddListDriverInfo, jtbApplicationId,
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

	protected JtbAddListDriverInfo getBygetByJtbAppId_PrevAndNext(
		Session session, JtbAddListDriverInfo jtbAddListDriverInfo,
		long jtbApplicationId,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBADDLISTDRIVERINFO_WHERE);

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
			sb.append(JtbAddListDriverInfoModelImpl.ORDER_BY_JPQL);
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
						jtbAddListDriverInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbAddListDriverInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb add list driver infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	@Override
	public void removeBygetByJtbAppId(long jtbApplicationId) {
		for (JtbAddListDriverInfo jtbAddListDriverInfo :
				findBygetByJtbAppId(
					jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbAddListDriverInfo);
		}
	}

	/**
	 * Returns the number of jtb add list driver infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add list driver infos
	 */
	@Override
	public int countBygetByJtbAppId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByJtbAppId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBADDLISTDRIVERINFO_WHERE);

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
			"jtbAddListDriverInfo.jtbApplicationId = ?";

	public JtbAddListDriverInfoPersistenceImpl() {
		setModelClass(JtbAddListDriverInfo.class);

		setModelImplClass(JtbAddListDriverInfoImpl.class);
		setModelPKClass(long.class);

		setTable(JtbAddListDriverInfoTable.INSTANCE);
	}

	/**
	 * Caches the jtb add list driver info in the entity cache if it is enabled.
	 *
	 * @param jtbAddListDriverInfo the jtb add list driver info
	 */
	@Override
	public void cacheResult(JtbAddListDriverInfo jtbAddListDriverInfo) {
		entityCache.putResult(
			JtbAddListDriverInfoImpl.class,
			jtbAddListDriverInfo.getPrimaryKey(), jtbAddListDriverInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb add list driver infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddListDriverInfos the jtb add list driver infos
	 */
	@Override
	public void cacheResult(List<JtbAddListDriverInfo> jtbAddListDriverInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbAddListDriverInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbAddListDriverInfo jtbAddListDriverInfo :
				jtbAddListDriverInfos) {

			if (entityCache.getResult(
					JtbAddListDriverInfoImpl.class,
					jtbAddListDriverInfo.getPrimaryKey()) == null) {

				cacheResult(jtbAddListDriverInfo);
			}
		}
	}

	/**
	 * Clears the cache for all jtb add list driver infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbAddListDriverInfoImpl.class);

		finderCache.clearCache(JtbAddListDriverInfoImpl.class);
	}

	/**
	 * Clears the cache for the jtb add list driver info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbAddListDriverInfo jtbAddListDriverInfo) {
		entityCache.removeResult(
			JtbAddListDriverInfoImpl.class, jtbAddListDriverInfo);
	}

	@Override
	public void clearCache(List<JtbAddListDriverInfo> jtbAddListDriverInfos) {
		for (JtbAddListDriverInfo jtbAddListDriverInfo :
				jtbAddListDriverInfos) {

			entityCache.removeResult(
				JtbAddListDriverInfoImpl.class, jtbAddListDriverInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbAddListDriverInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JtbAddListDriverInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new jtb add list driver info with the primary key. Does not add the jtb add list driver info to the database.
	 *
	 * @param jtbAddListDriverInfoId the primary key for the new jtb add list driver info
	 * @return the new jtb add list driver info
	 */
	@Override
	public JtbAddListDriverInfo create(long jtbAddListDriverInfoId) {
		JtbAddListDriverInfo jtbAddListDriverInfo =
			new JtbAddListDriverInfoImpl();

		jtbAddListDriverInfo.setNew(true);
		jtbAddListDriverInfo.setPrimaryKey(jtbAddListDriverInfoId);

		jtbAddListDriverInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbAddListDriverInfo;
	}

	/**
	 * Removes the jtb add list driver info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info that was removed
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public JtbAddListDriverInfo remove(long jtbAddListDriverInfoId)
		throws NoSuchJtbAddListDriverInfoException {

		return remove((Serializable)jtbAddListDriverInfoId);
	}

	/**
	 * Removes the jtb add list driver info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb add list driver info
	 * @return the jtb add list driver info that was removed
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public JtbAddListDriverInfo remove(Serializable primaryKey)
		throws NoSuchJtbAddListDriverInfoException {

		Session session = null;

		try {
			session = openSession();

			JtbAddListDriverInfo jtbAddListDriverInfo =
				(JtbAddListDriverInfo)session.get(
					JtbAddListDriverInfoImpl.class, primaryKey);

			if (jtbAddListDriverInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbAddListDriverInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbAddListDriverInfo);
		}
		catch (NoSuchJtbAddListDriverInfoException noSuchEntityException) {
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
	protected JtbAddListDriverInfo removeImpl(
		JtbAddListDriverInfo jtbAddListDriverInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbAddListDriverInfo)) {
				jtbAddListDriverInfo = (JtbAddListDriverInfo)session.get(
					JtbAddListDriverInfoImpl.class,
					jtbAddListDriverInfo.getPrimaryKeyObj());
			}

			if (jtbAddListDriverInfo != null) {
				session.delete(jtbAddListDriverInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbAddListDriverInfo != null) {
			clearCache(jtbAddListDriverInfo);
		}

		return jtbAddListDriverInfo;
	}

	@Override
	public JtbAddListDriverInfo updateImpl(
		JtbAddListDriverInfo jtbAddListDriverInfo) {

		boolean isNew = jtbAddListDriverInfo.isNew();

		if (!(jtbAddListDriverInfo instanceof JtbAddListDriverInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbAddListDriverInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbAddListDriverInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbAddListDriverInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbAddListDriverInfo implementation " +
					jtbAddListDriverInfo.getClass());
		}

		JtbAddListDriverInfoModelImpl jtbAddListDriverInfoModelImpl =
			(JtbAddListDriverInfoModelImpl)jtbAddListDriverInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbAddListDriverInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbAddListDriverInfo.setCreateDate(date);
			}
			else {
				jtbAddListDriverInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbAddListDriverInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbAddListDriverInfo.setModifiedDate(date);
			}
			else {
				jtbAddListDriverInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbAddListDriverInfo);
			}
			else {
				jtbAddListDriverInfo = (JtbAddListDriverInfo)session.merge(
					jtbAddListDriverInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbAddListDriverInfoImpl.class, jtbAddListDriverInfoModelImpl,
			false, true);

		if (isNew) {
			jtbAddListDriverInfo.setNew(false);
		}

		jtbAddListDriverInfo.resetOriginalValues();

		return jtbAddListDriverInfo;
	}

	/**
	 * Returns the jtb add list driver info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb add list driver info
	 * @return the jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public JtbAddListDriverInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbAddListDriverInfoException {

		JtbAddListDriverInfo jtbAddListDriverInfo = fetchByPrimaryKey(
			primaryKey);

		if (jtbAddListDriverInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbAddListDriverInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbAddListDriverInfo;
	}

	/**
	 * Returns the jtb add list driver info with the primary key or throws a <code>NoSuchJtbAddListDriverInfoException</code> if it could not be found.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info
	 * @throws NoSuchJtbAddListDriverInfoException if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public JtbAddListDriverInfo findByPrimaryKey(long jtbAddListDriverInfoId)
		throws NoSuchJtbAddListDriverInfoException {

		return findByPrimaryKey((Serializable)jtbAddListDriverInfoId);
	}

	/**
	 * Returns the jtb add list driver info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info, or <code>null</code> if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public JtbAddListDriverInfo fetchByPrimaryKey(long jtbAddListDriverInfoId) {
		return fetchByPrimaryKey((Serializable)jtbAddListDriverInfoId);
	}

	/**
	 * Returns all the jtb add list driver infos.
	 *
	 * @return the jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @return the range of jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add list driver infos
	 */
	@Override
	public List<JtbAddListDriverInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddListDriverInfo> orderByComparator,
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

		List<JtbAddListDriverInfo> list = null;

		if (useFinderCache) {
			list = (List<JtbAddListDriverInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBADDLISTDRIVERINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBADDLISTDRIVERINFO;

				sql = sql.concat(JtbAddListDriverInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbAddListDriverInfo>)QueryUtil.list(
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
	 * Removes all the jtb add list driver infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbAddListDriverInfo jtbAddListDriverInfo : findAll()) {
			remove(jtbAddListDriverInfo);
		}
	}

	/**
	 * Returns the number of jtb add list driver infos.
	 *
	 * @return the number of jtb add list driver infos
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
					_SQL_COUNT_JTBADDLISTDRIVERINFO);

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
		return "jtbAddListDriverInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBADDLISTDRIVERINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbAddListDriverInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb add list driver info persistence.
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

		JtbAddListDriverInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JtbAddListDriverInfoUtil.setPersistence(null);

		entityCache.removeCache(JtbAddListDriverInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_JTBADDLISTDRIVERINFO =
		"SELECT jtbAddListDriverInfo FROM JtbAddListDriverInfo jtbAddListDriverInfo";

	private static final String _SQL_SELECT_JTBADDLISTDRIVERINFO_WHERE =
		"SELECT jtbAddListDriverInfo FROM JtbAddListDriverInfo jtbAddListDriverInfo WHERE ";

	private static final String _SQL_COUNT_JTBADDLISTDRIVERINFO =
		"SELECT COUNT(jtbAddListDriverInfo) FROM JtbAddListDriverInfo jtbAddListDriverInfo";

	private static final String _SQL_COUNT_JTBADDLISTDRIVERINFO_WHERE =
		"SELECT COUNT(jtbAddListDriverInfo) FROM JtbAddListDriverInfo jtbAddListDriverInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbAddListDriverInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbAddListDriverInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbAddListDriverInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbAddListDriverInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}