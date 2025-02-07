/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevEmployeeDefineOccuAddException;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeDefineOccuAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeDefineOccuAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmployeeDefineOccuAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmployeeDefineOccuAddUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez dev employee define occu add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevEmployeeDefineOccuAddPersistence.class)
public class SezDevEmployeeDefineOccuAddPersistenceImpl
	extends BasePersistenceImpl<SezDevEmployeeDefineOccuAdd>
	implements SezDevEmployeeDefineOccuAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevEmployeeDefineOccuAddUtil</code> to access the sez dev employee define occu add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevEmployeeDefineOccuAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @return the range of matching sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezDevEmployeeDefineOccuAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevEmployeeDefineOccuAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd :
						list) {

					if (sezStatusApplicationId !=
							sezDevEmployeeDefineOccuAdd.
								getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZDEVEMPLOYEEDEFINEOCCUADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevEmployeeDefineOccuAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevEmployeeDefineOccuAdd>)QueryUtil.list(
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
	 * Returns the first sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a matching sez dev employee define occu add could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws NoSuchSezDevEmployeeDefineOccuAddException {

		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevEmployeeDefineOccuAdd != null) {
			return sezDevEmployeeDefineOccuAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevEmployeeDefineOccuAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee define occu add, or <code>null</code> if a matching sez dev employee define occu add could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		List<SezDevEmployeeDefineOccuAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a matching sez dev employee define occu add could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws NoSuchSezDevEmployeeDefineOccuAddException {

		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevEmployeeDefineOccuAdd != null) {
			return sezDevEmployeeDefineOccuAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevEmployeeDefineOccuAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee define occu add, or <code>null</code> if a matching sez dev employee define occu add could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevEmployeeDefineOccuAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev employee define occu adds before and after the current sez dev employee define occu add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the current sez dev employee define occu add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevEmployeeDefineOccuAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator)
		throws NoSuchSezDevEmployeeDefineOccuAddException {

		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd =
			findByPrimaryKey(sezDevEmployeeDefineOccuAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevEmployeeDefineOccuAdd[] array =
				new SezDevEmployeeDefineOccuAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevEmployeeDefineOccuAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevEmployeeDefineOccuAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevEmployeeDefineOccuAdd, sezStatusApplicationId,
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

	protected SezDevEmployeeDefineOccuAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session,
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVEMPLOYEEDEFINEOCCUADD_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezDevEmployeeDefineOccuAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezDevEmployeeDefineOccuAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevEmployeeDefineOccuAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev employee define occu adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevEmployeeDefineOccuAdd);
		}
	}

	/**
	 * Returns the number of sez dev employee define occu adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev employee define occu adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVEMPLOYEEDEFINEOCCUADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevEmployeeDefineOccuAdd.sezStatusApplicationId = ?";

	public SezDevEmployeeDefineOccuAddPersistenceImpl() {
		setModelClass(SezDevEmployeeDefineOccuAdd.class);

		setModelImplClass(SezDevEmployeeDefineOccuAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevEmployeeDefineOccuAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev employee define occu add in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeDefineOccuAdd the sez dev employee define occu add
	 */
	@Override
	public void cacheResult(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		entityCache.putResult(
			SezDevEmployeeDefineOccuAddImpl.class,
			sezDevEmployeeDefineOccuAdd.getPrimaryKey(),
			sezDevEmployeeDefineOccuAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev employee define occu adds in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeDefineOccuAdds the sez dev employee define occu adds
	 */
	@Override
	public void cacheResult(
		List<SezDevEmployeeDefineOccuAdd> sezDevEmployeeDefineOccuAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevEmployeeDefineOccuAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd :
				sezDevEmployeeDefineOccuAdds) {

			if (entityCache.getResult(
					SezDevEmployeeDefineOccuAddImpl.class,
					sezDevEmployeeDefineOccuAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevEmployeeDefineOccuAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev employee define occu adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevEmployeeDefineOccuAddImpl.class);

		finderCache.clearCache(SezDevEmployeeDefineOccuAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev employee define occu add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		entityCache.removeResult(
			SezDevEmployeeDefineOccuAddImpl.class, sezDevEmployeeDefineOccuAdd);
	}

	@Override
	public void clearCache(
		List<SezDevEmployeeDefineOccuAdd> sezDevEmployeeDefineOccuAdds) {

		for (SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd :
				sezDevEmployeeDefineOccuAdds) {

			entityCache.removeResult(
				SezDevEmployeeDefineOccuAddImpl.class,
				sezDevEmployeeDefineOccuAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevEmployeeDefineOccuAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevEmployeeDefineOccuAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev employee define occu add with the primary key. Does not add the sez dev employee define occu add to the database.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key for the new sez dev employee define occu add
	 * @return the new sez dev employee define occu add
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd create(
		long sezDevEmployeeDefineOccuAddId) {

		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd =
			new SezDevEmployeeDefineOccuAddImpl();

		sezDevEmployeeDefineOccuAdd.setNew(true);
		sezDevEmployeeDefineOccuAdd.setPrimaryKey(
			sezDevEmployeeDefineOccuAddId);

		sezDevEmployeeDefineOccuAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevEmployeeDefineOccuAdd;
	}

	/**
	 * Removes the sez dev employee define occu add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was removed
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd remove(
			long sezDevEmployeeDefineOccuAddId)
		throws NoSuchSezDevEmployeeDefineOccuAddException {

		return remove((Serializable)sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Removes the sez dev employee define occu add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was removed
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd remove(Serializable primaryKey)
		throws NoSuchSezDevEmployeeDefineOccuAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd =
				(SezDevEmployeeDefineOccuAdd)session.get(
					SezDevEmployeeDefineOccuAddImpl.class, primaryKey);

			if (sezDevEmployeeDefineOccuAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevEmployeeDefineOccuAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevEmployeeDefineOccuAdd);
		}
		catch (NoSuchSezDevEmployeeDefineOccuAddException
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
	protected SezDevEmployeeDefineOccuAdd removeImpl(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevEmployeeDefineOccuAdd)) {
				sezDevEmployeeDefineOccuAdd =
					(SezDevEmployeeDefineOccuAdd)session.get(
						SezDevEmployeeDefineOccuAddImpl.class,
						sezDevEmployeeDefineOccuAdd.getPrimaryKeyObj());
			}

			if (sezDevEmployeeDefineOccuAdd != null) {
				session.delete(sezDevEmployeeDefineOccuAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevEmployeeDefineOccuAdd != null) {
			clearCache(sezDevEmployeeDefineOccuAdd);
		}

		return sezDevEmployeeDefineOccuAdd;
	}

	@Override
	public SezDevEmployeeDefineOccuAdd updateImpl(
		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		boolean isNew = sezDevEmployeeDefineOccuAdd.isNew();

		if (!(sezDevEmployeeDefineOccuAdd instanceof
				SezDevEmployeeDefineOccuAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezDevEmployeeDefineOccuAdd.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevEmployeeDefineOccuAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevEmployeeDefineOccuAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevEmployeeDefineOccuAdd implementation " +
					sezDevEmployeeDefineOccuAdd.getClass());
		}

		SezDevEmployeeDefineOccuAddModelImpl
			sezDevEmployeeDefineOccuAddModelImpl =
				(SezDevEmployeeDefineOccuAddModelImpl)
					sezDevEmployeeDefineOccuAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevEmployeeDefineOccuAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevEmployeeDefineOccuAdd.setCreateDate(date);
			}
			else {
				sezDevEmployeeDefineOccuAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevEmployeeDefineOccuAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevEmployeeDefineOccuAdd.setModifiedDate(date);
			}
			else {
				sezDevEmployeeDefineOccuAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevEmployeeDefineOccuAdd);
			}
			else {
				sezDevEmployeeDefineOccuAdd =
					(SezDevEmployeeDefineOccuAdd)session.merge(
						sezDevEmployeeDefineOccuAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevEmployeeDefineOccuAddImpl.class,
			sezDevEmployeeDefineOccuAddModelImpl, false, true);

		if (isNew) {
			sezDevEmployeeDefineOccuAdd.setNew(false);
		}

		sezDevEmployeeDefineOccuAdd.resetOriginalValues();

		return sezDevEmployeeDefineOccuAdd;
	}

	/**
	 * Returns the sez dev employee define occu add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevEmployeeDefineOccuAddException {

		SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd =
			fetchByPrimaryKey(primaryKey);

		if (sezDevEmployeeDefineOccuAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevEmployeeDefineOccuAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevEmployeeDefineOccuAdd;
	}

	/**
	 * Returns the sez dev employee define occu add with the primary key or throws a <code>NoSuchSezDevEmployeeDefineOccuAddException</code> if it could not be found.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add
	 * @throws NoSuchSezDevEmployeeDefineOccuAddException if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd findByPrimaryKey(
			long sezDevEmployeeDefineOccuAddId)
		throws NoSuchSezDevEmployeeDefineOccuAddException {

		return findByPrimaryKey((Serializable)sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Returns the sez dev employee define occu add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add, or <code>null</code> if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeDefineOccuAdd fetchByPrimaryKey(
		long sezDevEmployeeDefineOccuAddId) {

		return fetchByPrimaryKey((Serializable)sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Returns all the sez dev employee define occu adds.
	 *
	 * @return the sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @return the range of sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev employee define occu adds
	 */
	@Override
	public List<SezDevEmployeeDefineOccuAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeDefineOccuAdd> orderByComparator,
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

		List<SezDevEmployeeDefineOccuAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevEmployeeDefineOccuAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVEMPLOYEEDEFINEOCCUADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVEMPLOYEEDEFINEOCCUADD;

				sql = sql.concat(
					SezDevEmployeeDefineOccuAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevEmployeeDefineOccuAdd>)QueryUtil.list(
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
	 * Removes all the sez dev employee define occu adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd :
				findAll()) {

			remove(sezDevEmployeeDefineOccuAdd);
		}
	}

	/**
	 * Returns the number of sez dev employee define occu adds.
	 *
	 * @return the number of sez dev employee define occu adds
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
					_SQL_COUNT_SEZDEVEMPLOYEEDEFINEOCCUADD);

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
		return "sezDevEmployeeDefineOccuAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVEMPLOYEEDEFINEOCCUADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevEmployeeDefineOccuAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev employee define occu add persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevEmployeeDefineOccuAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevEmployeeDefineOccuAddUtil.setPersistence(null);

		entityCache.removeCache(
			SezDevEmployeeDefineOccuAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVEMPLOYEEDEFINEOCCUADD =
		"SELECT sezDevEmployeeDefineOccuAdd FROM SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd";

	private static final String _SQL_SELECT_SEZDEVEMPLOYEEDEFINEOCCUADD_WHERE =
		"SELECT sezDevEmployeeDefineOccuAdd FROM SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVEMPLOYEEDEFINEOCCUADD =
		"SELECT COUNT(sezDevEmployeeDefineOccuAdd) FROM SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd";

	private static final String _SQL_COUNT_SEZDEVEMPLOYEEDEFINEOCCUADD_WHERE =
		"SELECT COUNT(sezDevEmployeeDefineOccuAdd) FROM SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevEmployeeDefineOccuAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevEmployeeDefineOccuAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevEmployeeDefineOccuAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevEmployeeDefineOccuAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}