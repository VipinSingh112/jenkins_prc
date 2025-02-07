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

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddListVehicleRegstException;
import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;
import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegstTable;
import com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstImpl;
import com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddListVehicleRegstPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddListVehicleRegstUtil;
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
 * The persistence implementation for the jtb add list vehicle regst service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JtbAddListVehicleRegstPersistence.class)
public class JtbAddListVehicleRegstPersistenceImpl
	extends BasePersistenceImpl<JtbAddListVehicleRegst>
	implements JtbAddListVehicleRegstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbAddListVehicleRegstUtil</code> to access the jtb add list vehicle regst persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbAddListVehicleRegstImpl.class.getName();

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
	 * Returns all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId) {

		return findBygetByJtbAppId(
			jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @return the range of matching jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return findBygetByJtbAppId(jtbApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		return findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator,
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

		List<JtbAddListVehicleRegst> list = null;

		if (useFinderCache) {
			list = (List<JtbAddListVehicleRegst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbAddListVehicleRegst jtbAddListVehicleRegst : list) {
					if (jtbApplicationId !=
							jtbAddListVehicleRegst.getJtbApplicationId()) {

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

			sb.append(_SQL_SELECT_JTBADDLISTVEHICLEREGST_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbAddListVehicleRegstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				list = (List<JtbAddListVehicleRegst>)QueryUtil.list(
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
	 * Returns the first jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a matching jtb add list vehicle regst could not be found
	 */
	@Override
	public JtbAddListVehicleRegst findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddListVehicleRegst> orderByComparator)
		throws NoSuchJtbAddListVehicleRegstException {

		JtbAddListVehicleRegst jtbAddListVehicleRegst =
			fetchBygetByJtbAppId_First(jtbApplicationId, orderByComparator);

		if (jtbAddListVehicleRegst != null) {
			return jtbAddListVehicleRegst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddListVehicleRegstException(sb.toString());
	}

	/**
	 * Returns the first jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add list vehicle regst, or <code>null</code> if a matching jtb add list vehicle regst could not be found
	 */
	@Override
	public JtbAddListVehicleRegst fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		List<JtbAddListVehicleRegst> list = findBygetByJtbAppId(
			jtbApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a matching jtb add list vehicle regst could not be found
	 */
	@Override
	public JtbAddListVehicleRegst findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddListVehicleRegst> orderByComparator)
		throws NoSuchJtbAddListVehicleRegstException {

		JtbAddListVehicleRegst jtbAddListVehicleRegst =
			fetchBygetByJtbAppId_Last(jtbApplicationId, orderByComparator);

		if (jtbAddListVehicleRegst != null) {
			return jtbAddListVehicleRegst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddListVehicleRegstException(sb.toString());
	}

	/**
	 * Returns the last jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add list vehicle regst, or <code>null</code> if a matching jtb add list vehicle regst could not be found
	 */
	@Override
	public JtbAddListVehicleRegst fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		int count = countBygetByJtbAppId(jtbApplicationId);

		if (count == 0) {
			return null;
		}

		List<JtbAddListVehicleRegst> list = findBygetByJtbAppId(
			jtbApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb add list vehicle regsts before and after the current jtb add list vehicle regst in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the current jtb add list vehicle regst
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public JtbAddListVehicleRegst[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddListVehicleRegstId, long jtbApplicationId,
			OrderByComparator<JtbAddListVehicleRegst> orderByComparator)
		throws NoSuchJtbAddListVehicleRegstException {

		JtbAddListVehicleRegst jtbAddListVehicleRegst = findByPrimaryKey(
			jtbAddListVehicleRegstId);

		Session session = null;

		try {
			session = openSession();

			JtbAddListVehicleRegst[] array = new JtbAddListVehicleRegstImpl[3];

			array[0] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddListVehicleRegst, jtbApplicationId,
				orderByComparator, true);

			array[1] = jtbAddListVehicleRegst;

			array[2] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddListVehicleRegst, jtbApplicationId,
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

	protected JtbAddListVehicleRegst getBygetByJtbAppId_PrevAndNext(
		Session session, JtbAddListVehicleRegst jtbAddListVehicleRegst,
		long jtbApplicationId,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBADDLISTVEHICLEREGST_WHERE);

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
			sb.append(JtbAddListVehicleRegstModelImpl.ORDER_BY_JPQL);
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
						jtbAddListVehicleRegst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbAddListVehicleRegst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb add list vehicle regsts where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	@Override
	public void removeBygetByJtbAppId(long jtbApplicationId) {
		for (JtbAddListVehicleRegst jtbAddListVehicleRegst :
				findBygetByJtbAppId(
					jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbAddListVehicleRegst);
		}
	}

	/**
	 * Returns the number of jtb add list vehicle regsts where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add list vehicle regsts
	 */
	@Override
	public int countBygetByJtbAppId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByJtbAppId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBADDLISTVEHICLEREGST_WHERE);

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
			"jtbAddListVehicleRegst.jtbApplicationId = ?";

	public JtbAddListVehicleRegstPersistenceImpl() {
		setModelClass(JtbAddListVehicleRegst.class);

		setModelImplClass(JtbAddListVehicleRegstImpl.class);
		setModelPKClass(long.class);

		setTable(JtbAddListVehicleRegstTable.INSTANCE);
	}

	/**
	 * Caches the jtb add list vehicle regst in the entity cache if it is enabled.
	 *
	 * @param jtbAddListVehicleRegst the jtb add list vehicle regst
	 */
	@Override
	public void cacheResult(JtbAddListVehicleRegst jtbAddListVehicleRegst) {
		entityCache.putResult(
			JtbAddListVehicleRegstImpl.class,
			jtbAddListVehicleRegst.getPrimaryKey(), jtbAddListVehicleRegst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb add list vehicle regsts in the entity cache if it is enabled.
	 *
	 * @param jtbAddListVehicleRegsts the jtb add list vehicle regsts
	 */
	@Override
	public void cacheResult(
		List<JtbAddListVehicleRegst> jtbAddListVehicleRegsts) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbAddListVehicleRegsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbAddListVehicleRegst jtbAddListVehicleRegst :
				jtbAddListVehicleRegsts) {

			if (entityCache.getResult(
					JtbAddListVehicleRegstImpl.class,
					jtbAddListVehicleRegst.getPrimaryKey()) == null) {

				cacheResult(jtbAddListVehicleRegst);
			}
		}
	}

	/**
	 * Clears the cache for all jtb add list vehicle regsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbAddListVehicleRegstImpl.class);

		finderCache.clearCache(JtbAddListVehicleRegstImpl.class);
	}

	/**
	 * Clears the cache for the jtb add list vehicle regst.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbAddListVehicleRegst jtbAddListVehicleRegst) {
		entityCache.removeResult(
			JtbAddListVehicleRegstImpl.class, jtbAddListVehicleRegst);
	}

	@Override
	public void clearCache(
		List<JtbAddListVehicleRegst> jtbAddListVehicleRegsts) {

		for (JtbAddListVehicleRegst jtbAddListVehicleRegst :
				jtbAddListVehicleRegsts) {

			entityCache.removeResult(
				JtbAddListVehicleRegstImpl.class, jtbAddListVehicleRegst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbAddListVehicleRegstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JtbAddListVehicleRegstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new jtb add list vehicle regst with the primary key. Does not add the jtb add list vehicle regst to the database.
	 *
	 * @param jtbAddListVehicleRegstId the primary key for the new jtb add list vehicle regst
	 * @return the new jtb add list vehicle regst
	 */
	@Override
	public JtbAddListVehicleRegst create(long jtbAddListVehicleRegstId) {
		JtbAddListVehicleRegst jtbAddListVehicleRegst =
			new JtbAddListVehicleRegstImpl();

		jtbAddListVehicleRegst.setNew(true);
		jtbAddListVehicleRegst.setPrimaryKey(jtbAddListVehicleRegstId);

		jtbAddListVehicleRegst.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbAddListVehicleRegst;
	}

	/**
	 * Removes the jtb add list vehicle regst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was removed
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public JtbAddListVehicleRegst remove(long jtbAddListVehicleRegstId)
		throws NoSuchJtbAddListVehicleRegstException {

		return remove((Serializable)jtbAddListVehicleRegstId);
	}

	/**
	 * Removes the jtb add list vehicle regst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was removed
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public JtbAddListVehicleRegst remove(Serializable primaryKey)
		throws NoSuchJtbAddListVehicleRegstException {

		Session session = null;

		try {
			session = openSession();

			JtbAddListVehicleRegst jtbAddListVehicleRegst =
				(JtbAddListVehicleRegst)session.get(
					JtbAddListVehicleRegstImpl.class, primaryKey);

			if (jtbAddListVehicleRegst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbAddListVehicleRegstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbAddListVehicleRegst);
		}
		catch (NoSuchJtbAddListVehicleRegstException noSuchEntityException) {
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
	protected JtbAddListVehicleRegst removeImpl(
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbAddListVehicleRegst)) {
				jtbAddListVehicleRegst = (JtbAddListVehicleRegst)session.get(
					JtbAddListVehicleRegstImpl.class,
					jtbAddListVehicleRegst.getPrimaryKeyObj());
			}

			if (jtbAddListVehicleRegst != null) {
				session.delete(jtbAddListVehicleRegst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbAddListVehicleRegst != null) {
			clearCache(jtbAddListVehicleRegst);
		}

		return jtbAddListVehicleRegst;
	}

	@Override
	public JtbAddListVehicleRegst updateImpl(
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		boolean isNew = jtbAddListVehicleRegst.isNew();

		if (!(jtbAddListVehicleRegst instanceof
				JtbAddListVehicleRegstModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbAddListVehicleRegst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbAddListVehicleRegst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbAddListVehicleRegst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbAddListVehicleRegst implementation " +
					jtbAddListVehicleRegst.getClass());
		}

		JtbAddListVehicleRegstModelImpl jtbAddListVehicleRegstModelImpl =
			(JtbAddListVehicleRegstModelImpl)jtbAddListVehicleRegst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbAddListVehicleRegst.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbAddListVehicleRegst.setCreateDate(date);
			}
			else {
				jtbAddListVehicleRegst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbAddListVehicleRegstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbAddListVehicleRegst.setModifiedDate(date);
			}
			else {
				jtbAddListVehicleRegst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbAddListVehicleRegst);
			}
			else {
				jtbAddListVehicleRegst = (JtbAddListVehicleRegst)session.merge(
					jtbAddListVehicleRegst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbAddListVehicleRegstImpl.class, jtbAddListVehicleRegstModelImpl,
			false, true);

		if (isNew) {
			jtbAddListVehicleRegst.setNew(false);
		}

		jtbAddListVehicleRegst.resetOriginalValues();

		return jtbAddListVehicleRegst;
	}

	/**
	 * Returns the jtb add list vehicle regst with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public JtbAddListVehicleRegst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbAddListVehicleRegstException {

		JtbAddListVehicleRegst jtbAddListVehicleRegst = fetchByPrimaryKey(
			primaryKey);

		if (jtbAddListVehicleRegst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbAddListVehicleRegstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbAddListVehicleRegst;
	}

	/**
	 * Returns the jtb add list vehicle regst with the primary key or throws a <code>NoSuchJtbAddListVehicleRegstException</code> if it could not be found.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst
	 * @throws NoSuchJtbAddListVehicleRegstException if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public JtbAddListVehicleRegst findByPrimaryKey(
			long jtbAddListVehicleRegstId)
		throws NoSuchJtbAddListVehicleRegstException {

		return findByPrimaryKey((Serializable)jtbAddListVehicleRegstId);
	}

	/**
	 * Returns the jtb add list vehicle regst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst, or <code>null</code> if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public JtbAddListVehicleRegst fetchByPrimaryKey(
		long jtbAddListVehicleRegstId) {

		return fetchByPrimaryKey((Serializable)jtbAddListVehicleRegstId);
	}

	/**
	 * Returns all the jtb add list vehicle regsts.
	 *
	 * @return the jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @return the range of jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findAll(
		int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add list vehicle regsts
	 */
	@Override
	public List<JtbAddListVehicleRegst> findAll(
		int start, int end,
		OrderByComparator<JtbAddListVehicleRegst> orderByComparator,
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

		List<JtbAddListVehicleRegst> list = null;

		if (useFinderCache) {
			list = (List<JtbAddListVehicleRegst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBADDLISTVEHICLEREGST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBADDLISTVEHICLEREGST;

				sql = sql.concat(JtbAddListVehicleRegstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbAddListVehicleRegst>)QueryUtil.list(
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
	 * Removes all the jtb add list vehicle regsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbAddListVehicleRegst jtbAddListVehicleRegst : findAll()) {
			remove(jtbAddListVehicleRegst);
		}
	}

	/**
	 * Returns the number of jtb add list vehicle regsts.
	 *
	 * @return the number of jtb add list vehicle regsts
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
					_SQL_COUNT_JTBADDLISTVEHICLEREGST);

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
		return "jtbAddListVehicleRegstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBADDLISTVEHICLEREGST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbAddListVehicleRegstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb add list vehicle regst persistence.
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

		JtbAddListVehicleRegstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JtbAddListVehicleRegstUtil.setPersistence(null);

		entityCache.removeCache(JtbAddListVehicleRegstImpl.class.getName());
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

	private static final String _SQL_SELECT_JTBADDLISTVEHICLEREGST =
		"SELECT jtbAddListVehicleRegst FROM JtbAddListVehicleRegst jtbAddListVehicleRegst";

	private static final String _SQL_SELECT_JTBADDLISTVEHICLEREGST_WHERE =
		"SELECT jtbAddListVehicleRegst FROM JtbAddListVehicleRegst jtbAddListVehicleRegst WHERE ";

	private static final String _SQL_COUNT_JTBADDLISTVEHICLEREGST =
		"SELECT COUNT(jtbAddListVehicleRegst) FROM JtbAddListVehicleRegst jtbAddListVehicleRegst";

	private static final String _SQL_COUNT_JTBADDLISTVEHICLEREGST_WHERE =
		"SELECT COUNT(jtbAddListVehicleRegst) FROM JtbAddListVehicleRegst jtbAddListVehicleRegst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbAddListVehicleRegst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbAddListVehicleRegst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbAddListVehicleRegst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbAddListVehicleRegstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}