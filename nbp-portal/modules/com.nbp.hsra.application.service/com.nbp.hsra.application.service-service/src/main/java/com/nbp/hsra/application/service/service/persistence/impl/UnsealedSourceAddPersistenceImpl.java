/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchUnsealedSourceAddException;
import com.nbp.hsra.application.service.model.UnsealedSourceAdd;
import com.nbp.hsra.application.service.model.UnsealedSourceAddTable;
import com.nbp.hsra.application.service.model.impl.UnsealedSourceAddImpl;
import com.nbp.hsra.application.service.model.impl.UnsealedSourceAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.UnsealedSourceAddPersistence;
import com.nbp.hsra.application.service.service.persistence.UnsealedSourceAddUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the unsealed source add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UnsealedSourceAddPersistence.class)
public class UnsealedSourceAddPersistenceImpl
	extends BasePersistenceImpl<UnsealedSourceAdd>
	implements UnsealedSourceAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UnsealedSourceAddUtil</code> to access the unsealed source add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UnsealedSourceAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @return the range of matching unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<UnsealedSourceAdd> list = null;

		if (useFinderCache) {
			list = (List<UnsealedSourceAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UnsealedSourceAdd unsealedSourceAdd : list) {
					if (hsraApplicationId !=
							unsealedSourceAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_UNSEALEDSOURCEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(UnsealedSourceAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<UnsealedSourceAdd>)QueryUtil.list(
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
	 * Returns the first unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a matching unsealed source add could not be found
	 */
	@Override
	public UnsealedSourceAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<UnsealedSourceAdd> orderByComparator)
		throws NoSuchUnsealedSourceAddException {

		UnsealedSourceAdd unsealedSourceAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (unsealedSourceAdd != null) {
			return unsealedSourceAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchUnsealedSourceAddException(sb.toString());
	}

	/**
	 * Returns the first unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsealed source add, or <code>null</code> if a matching unsealed source add could not be found
	 */
	@Override
	public UnsealedSourceAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		List<UnsealedSourceAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a matching unsealed source add could not be found
	 */
	@Override
	public UnsealedSourceAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<UnsealedSourceAdd> orderByComparator)
		throws NoSuchUnsealedSourceAddException {

		UnsealedSourceAdd unsealedSourceAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (unsealedSourceAdd != null) {
			return unsealedSourceAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchUnsealedSourceAddException(sb.toString());
	}

	/**
	 * Returns the last unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsealed source add, or <code>null</code> if a matching unsealed source add could not be found
	 */
	@Override
	public UnsealedSourceAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<UnsealedSourceAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the unsealed source adds before and after the current unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param unsealedSourceAddId the primary key of the current unsealed source add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	@Override
	public UnsealedSourceAdd[] findBygetHsraById_PrevAndNext(
			long unsealedSourceAddId, long hsraApplicationId,
			OrderByComparator<UnsealedSourceAdd> orderByComparator)
		throws NoSuchUnsealedSourceAddException {

		UnsealedSourceAdd unsealedSourceAdd = findByPrimaryKey(
			unsealedSourceAddId);

		Session session = null;

		try {
			session = openSession();

			UnsealedSourceAdd[] array = new UnsealedSourceAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, unsealedSourceAdd, hsraApplicationId,
				orderByComparator, true);

			array[1] = unsealedSourceAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, unsealedSourceAdd, hsraApplicationId,
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

	protected UnsealedSourceAdd getBygetHsraById_PrevAndNext(
		Session session, UnsealedSourceAdd unsealedSourceAdd,
		long hsraApplicationId,
		OrderByComparator<UnsealedSourceAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_UNSEALEDSOURCEADD_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(UnsealedSourceAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						unsealedSourceAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<UnsealedSourceAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the unsealed source adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (UnsealedSourceAdd unsealedSourceAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(unsealedSourceAdd);
		}
	}

	/**
	 * Returns the number of unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching unsealed source adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_UNSEALEDSOURCEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"unsealedSourceAdd.hsraApplicationId = ?";

	public UnsealedSourceAddPersistenceImpl() {
		setModelClass(UnsealedSourceAdd.class);

		setModelImplClass(UnsealedSourceAddImpl.class);
		setModelPKClass(long.class);

		setTable(UnsealedSourceAddTable.INSTANCE);
	}

	/**
	 * Caches the unsealed source add in the entity cache if it is enabled.
	 *
	 * @param unsealedSourceAdd the unsealed source add
	 */
	@Override
	public void cacheResult(UnsealedSourceAdd unsealedSourceAdd) {
		entityCache.putResult(
			UnsealedSourceAddImpl.class, unsealedSourceAdd.getPrimaryKey(),
			unsealedSourceAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the unsealed source adds in the entity cache if it is enabled.
	 *
	 * @param unsealedSourceAdds the unsealed source adds
	 */
	@Override
	public void cacheResult(List<UnsealedSourceAdd> unsealedSourceAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (unsealedSourceAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (UnsealedSourceAdd unsealedSourceAdd : unsealedSourceAdds) {
			if (entityCache.getResult(
					UnsealedSourceAddImpl.class,
					unsealedSourceAdd.getPrimaryKey()) == null) {

				cacheResult(unsealedSourceAdd);
			}
		}
	}

	/**
	 * Clears the cache for all unsealed source adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UnsealedSourceAddImpl.class);

		finderCache.clearCache(UnsealedSourceAddImpl.class);
	}

	/**
	 * Clears the cache for the unsealed source add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UnsealedSourceAdd unsealedSourceAdd) {
		entityCache.removeResult(
			UnsealedSourceAddImpl.class, unsealedSourceAdd);
	}

	@Override
	public void clearCache(List<UnsealedSourceAdd> unsealedSourceAdds) {
		for (UnsealedSourceAdd unsealedSourceAdd : unsealedSourceAdds) {
			entityCache.removeResult(
				UnsealedSourceAddImpl.class, unsealedSourceAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(UnsealedSourceAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(UnsealedSourceAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new unsealed source add with the primary key. Does not add the unsealed source add to the database.
	 *
	 * @param unsealedSourceAddId the primary key for the new unsealed source add
	 * @return the new unsealed source add
	 */
	@Override
	public UnsealedSourceAdd create(long unsealedSourceAddId) {
		UnsealedSourceAdd unsealedSourceAdd = new UnsealedSourceAddImpl();

		unsealedSourceAdd.setNew(true);
		unsealedSourceAdd.setPrimaryKey(unsealedSourceAddId);

		unsealedSourceAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return unsealedSourceAdd;
	}

	/**
	 * Removes the unsealed source add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add that was removed
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	@Override
	public UnsealedSourceAdd remove(long unsealedSourceAddId)
		throws NoSuchUnsealedSourceAddException {

		return remove((Serializable)unsealedSourceAddId);
	}

	/**
	 * Removes the unsealed source add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the unsealed source add
	 * @return the unsealed source add that was removed
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	@Override
	public UnsealedSourceAdd remove(Serializable primaryKey)
		throws NoSuchUnsealedSourceAddException {

		Session session = null;

		try {
			session = openSession();

			UnsealedSourceAdd unsealedSourceAdd =
				(UnsealedSourceAdd)session.get(
					UnsealedSourceAddImpl.class, primaryKey);

			if (unsealedSourceAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUnsealedSourceAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(unsealedSourceAdd);
		}
		catch (NoSuchUnsealedSourceAddException noSuchEntityException) {
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
	protected UnsealedSourceAdd removeImpl(
		UnsealedSourceAdd unsealedSourceAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(unsealedSourceAdd)) {
				unsealedSourceAdd = (UnsealedSourceAdd)session.get(
					UnsealedSourceAddImpl.class,
					unsealedSourceAdd.getPrimaryKeyObj());
			}

			if (unsealedSourceAdd != null) {
				session.delete(unsealedSourceAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (unsealedSourceAdd != null) {
			clearCache(unsealedSourceAdd);
		}

		return unsealedSourceAdd;
	}

	@Override
	public UnsealedSourceAdd updateImpl(UnsealedSourceAdd unsealedSourceAdd) {
		boolean isNew = unsealedSourceAdd.isNew();

		if (!(unsealedSourceAdd instanceof UnsealedSourceAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(unsealedSourceAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					unsealedSourceAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in unsealedSourceAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UnsealedSourceAdd implementation " +
					unsealedSourceAdd.getClass());
		}

		UnsealedSourceAddModelImpl unsealedSourceAddModelImpl =
			(UnsealedSourceAddModelImpl)unsealedSourceAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (unsealedSourceAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				unsealedSourceAdd.setCreateDate(date);
			}
			else {
				unsealedSourceAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!unsealedSourceAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				unsealedSourceAdd.setModifiedDate(date);
			}
			else {
				unsealedSourceAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(unsealedSourceAdd);
			}
			else {
				unsealedSourceAdd = (UnsealedSourceAdd)session.merge(
					unsealedSourceAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			UnsealedSourceAddImpl.class, unsealedSourceAddModelImpl, false,
			true);

		if (isNew) {
			unsealedSourceAdd.setNew(false);
		}

		unsealedSourceAdd.resetOriginalValues();

		return unsealedSourceAdd;
	}

	/**
	 * Returns the unsealed source add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the unsealed source add
	 * @return the unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	@Override
	public UnsealedSourceAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUnsealedSourceAddException {

		UnsealedSourceAdd unsealedSourceAdd = fetchByPrimaryKey(primaryKey);

		if (unsealedSourceAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUnsealedSourceAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return unsealedSourceAdd;
	}

	/**
	 * Returns the unsealed source add with the primary key or throws a <code>NoSuchUnsealedSourceAddException</code> if it could not be found.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	@Override
	public UnsealedSourceAdd findByPrimaryKey(long unsealedSourceAddId)
		throws NoSuchUnsealedSourceAddException {

		return findByPrimaryKey((Serializable)unsealedSourceAddId);
	}

	/**
	 * Returns the unsealed source add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add, or <code>null</code> if a unsealed source add with the primary key could not be found
	 */
	@Override
	public UnsealedSourceAdd fetchByPrimaryKey(long unsealedSourceAddId) {
		return fetchByPrimaryKey((Serializable)unsealedSourceAddId);
	}

	/**
	 * Returns all the unsealed source adds.
	 *
	 * @return the unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @return the range of unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findAll(
		int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of unsealed source adds
	 */
	@Override
	public List<UnsealedSourceAdd> findAll(
		int start, int end,
		OrderByComparator<UnsealedSourceAdd> orderByComparator,
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

		List<UnsealedSourceAdd> list = null;

		if (useFinderCache) {
			list = (List<UnsealedSourceAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_UNSEALEDSOURCEADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_UNSEALEDSOURCEADD;

				sql = sql.concat(UnsealedSourceAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<UnsealedSourceAdd>)QueryUtil.list(
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
	 * Removes all the unsealed source adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UnsealedSourceAdd unsealedSourceAdd : findAll()) {
			remove(unsealedSourceAdd);
		}
	}

	/**
	 * Returns the number of unsealed source adds.
	 *
	 * @return the number of unsealed source adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_UNSEALEDSOURCEADD);

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
		return "unsealedSourceAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_UNSEALEDSOURCEADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UnsealedSourceAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the unsealed source add persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		UnsealedSourceAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		UnsealedSourceAddUtil.setPersistence(null);

		entityCache.removeCache(UnsealedSourceAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_UNSEALEDSOURCEADD =
		"SELECT unsealedSourceAdd FROM UnsealedSourceAdd unsealedSourceAdd";

	private static final String _SQL_SELECT_UNSEALEDSOURCEADD_WHERE =
		"SELECT unsealedSourceAdd FROM UnsealedSourceAdd unsealedSourceAdd WHERE ";

	private static final String _SQL_COUNT_UNSEALEDSOURCEADD =
		"SELECT COUNT(unsealedSourceAdd) FROM UnsealedSourceAdd unsealedSourceAdd";

	private static final String _SQL_COUNT_UNSEALEDSOURCEADD_WHERE =
		"SELECT COUNT(unsealedSourceAdd) FROM UnsealedSourceAdd unsealedSourceAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "unsealedSourceAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No UnsealedSourceAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No UnsealedSourceAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UnsealedSourceAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}