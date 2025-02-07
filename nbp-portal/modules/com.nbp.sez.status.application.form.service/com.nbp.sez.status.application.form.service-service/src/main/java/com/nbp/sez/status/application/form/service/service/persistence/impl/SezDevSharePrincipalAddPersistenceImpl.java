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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevSharePrincipalAddException;
import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd;
import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevSharePrincipalAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevSharePrincipalAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevSharePrincipalAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevSharePrincipalAddUtil;
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
 * The persistence implementation for the sez dev share principal add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevSharePrincipalAddPersistence.class)
public class SezDevSharePrincipalAddPersistenceImpl
	extends BasePersistenceImpl<SezDevSharePrincipalAdd>
	implements SezDevSharePrincipalAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevSharePrincipalAddUtil</code> to access the sez dev share principal add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevSharePrincipalAddImpl.class.getName();

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
	 * Returns all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @return the range of matching sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevSharePrincipalAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevSharePrincipalAdd> orderByComparator,
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

		List<SezDevSharePrincipalAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevSharePrincipalAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevSharePrincipalAdd sezDevSharePrincipalAdd : list) {
					if (sezStatusApplicationId !=
							sezDevSharePrincipalAdd.
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

			sb.append(_SQL_SELECT_SEZDEVSHAREPRINCIPALADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevSharePrincipalAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevSharePrincipalAdd>)QueryUtil.list(
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
	 * Returns the first sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a matching sez dev share principal add could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevSharePrincipalAdd> orderByComparator)
		throws NoSuchSezDevSharePrincipalAddException {

		SezDevSharePrincipalAdd sezDevSharePrincipalAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevSharePrincipalAdd != null) {
			return sezDevSharePrincipalAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevSharePrincipalAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share principal add, or <code>null</code> if a matching sez dev share principal add could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePrincipalAdd> orderByComparator) {

		List<SezDevSharePrincipalAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a matching sez dev share principal add could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevSharePrincipalAdd> orderByComparator)
		throws NoSuchSezDevSharePrincipalAddException {

		SezDevSharePrincipalAdd sezDevSharePrincipalAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevSharePrincipalAdd != null) {
			return sezDevSharePrincipalAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevSharePrincipalAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share principal add, or <code>null</code> if a matching sez dev share principal add could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePrincipalAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevSharePrincipalAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev share principal adds before and after the current sez dev share principal add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the current sez dev share principal add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevSharePrincipalAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevSharePrincipalAdd> orderByComparator)
		throws NoSuchSezDevSharePrincipalAddException {

		SezDevSharePrincipalAdd sezDevSharePrincipalAdd = findByPrimaryKey(
			sezDevSharePrincipalAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevSharePrincipalAdd[] array =
				new SezDevSharePrincipalAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevSharePrincipalAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevSharePrincipalAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevSharePrincipalAdd, sezStatusApplicationId,
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

	protected SezDevSharePrincipalAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezDevSharePrincipalAdd sezDevSharePrincipalAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePrincipalAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVSHAREPRINCIPALADD_WHERE);

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
			sb.append(SezDevSharePrincipalAddModelImpl.ORDER_BY_JPQL);
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
						sezDevSharePrincipalAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevSharePrincipalAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev share principal adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevSharePrincipalAdd sezDevSharePrincipalAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevSharePrincipalAdd);
		}
	}

	/**
	 * Returns the number of sez dev share principal adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share principal adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVSHAREPRINCIPALADD_WHERE);

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
			"sezDevSharePrincipalAdd.sezStatusApplicationId = ?";

	public SezDevSharePrincipalAddPersistenceImpl() {
		setModelClass(SezDevSharePrincipalAdd.class);

		setModelImplClass(SezDevSharePrincipalAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevSharePrincipalAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev share principal add in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePrincipalAdd the sez dev share principal add
	 */
	@Override
	public void cacheResult(SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {
		entityCache.putResult(
			SezDevSharePrincipalAddImpl.class,
			sezDevSharePrincipalAdd.getPrimaryKey(), sezDevSharePrincipalAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev share principal adds in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePrincipalAdds the sez dev share principal adds
	 */
	@Override
	public void cacheResult(
		List<SezDevSharePrincipalAdd> sezDevSharePrincipalAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevSharePrincipalAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevSharePrincipalAdd sezDevSharePrincipalAdd :
				sezDevSharePrincipalAdds) {

			if (entityCache.getResult(
					SezDevSharePrincipalAddImpl.class,
					sezDevSharePrincipalAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevSharePrincipalAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev share principal adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevSharePrincipalAddImpl.class);

		finderCache.clearCache(SezDevSharePrincipalAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev share principal add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {
		entityCache.removeResult(
			SezDevSharePrincipalAddImpl.class, sezDevSharePrincipalAdd);
	}

	@Override
	public void clearCache(
		List<SezDevSharePrincipalAdd> sezDevSharePrincipalAdds) {

		for (SezDevSharePrincipalAdd sezDevSharePrincipalAdd :
				sezDevSharePrincipalAdds) {

			entityCache.removeResult(
				SezDevSharePrincipalAddImpl.class, sezDevSharePrincipalAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevSharePrincipalAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevSharePrincipalAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev share principal add with the primary key. Does not add the sez dev share principal add to the database.
	 *
	 * @param sezDevSharePrincipalAddId the primary key for the new sez dev share principal add
	 * @return the new sez dev share principal add
	 */
	@Override
	public SezDevSharePrincipalAdd create(long sezDevSharePrincipalAddId) {
		SezDevSharePrincipalAdd sezDevSharePrincipalAdd =
			new SezDevSharePrincipalAddImpl();

		sezDevSharePrincipalAdd.setNew(true);
		sezDevSharePrincipalAdd.setPrimaryKey(sezDevSharePrincipalAddId);

		sezDevSharePrincipalAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezDevSharePrincipalAdd;
	}

	/**
	 * Removes the sez dev share principal add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add that was removed
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd remove(long sezDevSharePrincipalAddId)
		throws NoSuchSezDevSharePrincipalAddException {

		return remove((Serializable)sezDevSharePrincipalAddId);
	}

	/**
	 * Removes the sez dev share principal add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev share principal add
	 * @return the sez dev share principal add that was removed
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd remove(Serializable primaryKey)
		throws NoSuchSezDevSharePrincipalAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevSharePrincipalAdd sezDevSharePrincipalAdd =
				(SezDevSharePrincipalAdd)session.get(
					SezDevSharePrincipalAddImpl.class, primaryKey);

			if (sezDevSharePrincipalAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevSharePrincipalAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevSharePrincipalAdd);
		}
		catch (NoSuchSezDevSharePrincipalAddException noSuchEntityException) {
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
	protected SezDevSharePrincipalAdd removeImpl(
		SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevSharePrincipalAdd)) {
				sezDevSharePrincipalAdd = (SezDevSharePrincipalAdd)session.get(
					SezDevSharePrincipalAddImpl.class,
					sezDevSharePrincipalAdd.getPrimaryKeyObj());
			}

			if (sezDevSharePrincipalAdd != null) {
				session.delete(sezDevSharePrincipalAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevSharePrincipalAdd != null) {
			clearCache(sezDevSharePrincipalAdd);
		}

		return sezDevSharePrincipalAdd;
	}

	@Override
	public SezDevSharePrincipalAdd updateImpl(
		SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

		boolean isNew = sezDevSharePrincipalAdd.isNew();

		if (!(sezDevSharePrincipalAdd instanceof
				SezDevSharePrincipalAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevSharePrincipalAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevSharePrincipalAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevSharePrincipalAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevSharePrincipalAdd implementation " +
					sezDevSharePrincipalAdd.getClass());
		}

		SezDevSharePrincipalAddModelImpl sezDevSharePrincipalAddModelImpl =
			(SezDevSharePrincipalAddModelImpl)sezDevSharePrincipalAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevSharePrincipalAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevSharePrincipalAdd.setCreateDate(date);
			}
			else {
				sezDevSharePrincipalAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevSharePrincipalAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevSharePrincipalAdd.setModifiedDate(date);
			}
			else {
				sezDevSharePrincipalAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevSharePrincipalAdd);
			}
			else {
				sezDevSharePrincipalAdd =
					(SezDevSharePrincipalAdd)session.merge(
						sezDevSharePrincipalAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevSharePrincipalAddImpl.class, sezDevSharePrincipalAddModelImpl,
			false, true);

		if (isNew) {
			sezDevSharePrincipalAdd.setNew(false);
		}

		sezDevSharePrincipalAdd.resetOriginalValues();

		return sezDevSharePrincipalAdd;
	}

	/**
	 * Returns the sez dev share principal add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev share principal add
	 * @return the sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevSharePrincipalAddException {

		SezDevSharePrincipalAdd sezDevSharePrincipalAdd = fetchByPrimaryKey(
			primaryKey);

		if (sezDevSharePrincipalAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevSharePrincipalAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevSharePrincipalAdd;
	}

	/**
	 * Returns the sez dev share principal add with the primary key or throws a <code>NoSuchSezDevSharePrincipalAddException</code> if it could not be found.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add
	 * @throws NoSuchSezDevSharePrincipalAddException if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd findByPrimaryKey(
			long sezDevSharePrincipalAddId)
		throws NoSuchSezDevSharePrincipalAddException {

		return findByPrimaryKey((Serializable)sezDevSharePrincipalAddId);
	}

	/**
	 * Returns the sez dev share principal add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add, or <code>null</code> if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public SezDevSharePrincipalAdd fetchByPrimaryKey(
		long sezDevSharePrincipalAddId) {

		return fetchByPrimaryKey((Serializable)sezDevSharePrincipalAddId);
	}

	/**
	 * Returns all the sez dev share principal adds.
	 *
	 * @return the sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share principal adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @return the range of sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share principal adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevSharePrincipalAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share principal adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share principal adds
	 */
	@Override
	public List<SezDevSharePrincipalAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevSharePrincipalAdd> orderByComparator,
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

		List<SezDevSharePrincipalAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevSharePrincipalAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVSHAREPRINCIPALADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVSHAREPRINCIPALADD;

				sql = sql.concat(
					SezDevSharePrincipalAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevSharePrincipalAdd>)QueryUtil.list(
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
	 * Removes all the sez dev share principal adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevSharePrincipalAdd sezDevSharePrincipalAdd : findAll()) {
			remove(sezDevSharePrincipalAdd);
		}
	}

	/**
	 * Returns the number of sez dev share principal adds.
	 *
	 * @return the number of sez dev share principal adds
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
					_SQL_COUNT_SEZDEVSHAREPRINCIPALADD);

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
		return "sezDevSharePrincipalAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVSHAREPRINCIPALADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevSharePrincipalAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev share principal add persistence.
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

		SezDevSharePrincipalAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevSharePrincipalAddUtil.setPersistence(null);

		entityCache.removeCache(SezDevSharePrincipalAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVSHAREPRINCIPALADD =
		"SELECT sezDevSharePrincipalAdd FROM SezDevSharePrincipalAdd sezDevSharePrincipalAdd";

	private static final String _SQL_SELECT_SEZDEVSHAREPRINCIPALADD_WHERE =
		"SELECT sezDevSharePrincipalAdd FROM SezDevSharePrincipalAdd sezDevSharePrincipalAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVSHAREPRINCIPALADD =
		"SELECT COUNT(sezDevSharePrincipalAdd) FROM SezDevSharePrincipalAdd sezDevSharePrincipalAdd";

	private static final String _SQL_COUNT_SEZDEVSHAREPRINCIPALADD_WHERE =
		"SELECT COUNT(sezDevSharePrincipalAdd) FROM SezDevSharePrincipalAdd sezDevSharePrincipalAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevSharePrincipalAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevSharePrincipalAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevSharePrincipalAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevSharePrincipalAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}