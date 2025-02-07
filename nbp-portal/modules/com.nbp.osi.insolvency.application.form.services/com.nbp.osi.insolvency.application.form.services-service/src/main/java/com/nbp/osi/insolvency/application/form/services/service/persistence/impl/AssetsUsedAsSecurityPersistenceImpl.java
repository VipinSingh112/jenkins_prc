/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssetsUsedAsSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurity;
import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurityTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.AssetsUsedAsSecurityImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.AssetsUsedAsSecurityModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsUsedAsSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsUsedAsSecurityUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the assets used as security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AssetsUsedAsSecurityPersistence.class)
public class AssetsUsedAsSecurityPersistenceImpl
	extends BasePersistenceImpl<AssetsUsedAsSecurity>
	implements AssetsUsedAsSecurityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AssetsUsedAsSecurityUtil</code> to access the assets used as security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AssetsUsedAsSecurityImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @return the range of matching assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<AssetsUsedAsSecurity> list = null;

		if (useFinderCache) {
			list = (List<AssetsUsedAsSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssetsUsedAsSecurity assetsUsedAsSecurity : list) {
					if (osiInsolvencyId !=
							assetsUsedAsSecurity.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_ASSETSUSEDASSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssetsUsedAsSecurityModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<AssetsUsedAsSecurity>)QueryUtil.list(
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
	 * Returns the first assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a matching assets used as security could not be found
	 */
	@Override
	public AssetsUsedAsSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<AssetsUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsUsedAsSecurityException {

		AssetsUsedAsSecurity assetsUsedAsSecurity = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (assetsUsedAsSecurity != null) {
			return assetsUsedAsSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchAssetsUsedAsSecurityException(sb.toString());
	}

	/**
	 * Returns the first assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets used as security, or <code>null</code> if a matching assets used as security could not be found
	 */
	@Override
	public AssetsUsedAsSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		List<AssetsUsedAsSecurity> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a matching assets used as security could not be found
	 */
	@Override
	public AssetsUsedAsSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<AssetsUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsUsedAsSecurityException {

		AssetsUsedAsSecurity assetsUsedAsSecurity = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (assetsUsedAsSecurity != null) {
			return assetsUsedAsSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchAssetsUsedAsSecurityException(sb.toString());
	}

	/**
	 * Returns the last assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets used as security, or <code>null</code> if a matching assets used as security could not be found
	 */
	@Override
	public AssetsUsedAsSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<AssetsUsedAsSecurity> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assets used as securities before and after the current assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the current assets used as security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	@Override
	public AssetsUsedAsSecurity[] findBygetOsiById_PrevAndNext(
			long assetsUsedAsSecurityId, long osiInsolvencyId,
			OrderByComparator<AssetsUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsUsedAsSecurityException {

		AssetsUsedAsSecurity assetsUsedAsSecurity = findByPrimaryKey(
			assetsUsedAsSecurityId);

		Session session = null;

		try {
			session = openSession();

			AssetsUsedAsSecurity[] array = new AssetsUsedAsSecurityImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, assetsUsedAsSecurity, osiInsolvencyId,
				orderByComparator, true);

			array[1] = assetsUsedAsSecurity;

			array[2] = getBygetOsiById_PrevAndNext(
				session, assetsUsedAsSecurity, osiInsolvencyId,
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

	protected AssetsUsedAsSecurity getBygetOsiById_PrevAndNext(
		Session session, AssetsUsedAsSecurity assetsUsedAsSecurity,
		long osiInsolvencyId,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSETSUSEDASSECURITY_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(AssetsUsedAsSecurityModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						assetsUsedAsSecurity)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssetsUsedAsSecurity> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assets used as securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (AssetsUsedAsSecurity assetsUsedAsSecurity :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(assetsUsedAsSecurity);
		}
	}

	/**
	 * Returns the number of assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assets used as securities
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSETSUSEDASSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"assetsUsedAsSecurity.osiInsolvencyId = ?";

	public AssetsUsedAsSecurityPersistenceImpl() {
		setModelClass(AssetsUsedAsSecurity.class);

		setModelImplClass(AssetsUsedAsSecurityImpl.class);
		setModelPKClass(long.class);

		setTable(AssetsUsedAsSecurityTable.INSTANCE);
	}

	/**
	 * Caches the assets used as security in the entity cache if it is enabled.
	 *
	 * @param assetsUsedAsSecurity the assets used as security
	 */
	@Override
	public void cacheResult(AssetsUsedAsSecurity assetsUsedAsSecurity) {
		entityCache.putResult(
			AssetsUsedAsSecurityImpl.class,
			assetsUsedAsSecurity.getPrimaryKey(), assetsUsedAsSecurity);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the assets used as securities in the entity cache if it is enabled.
	 *
	 * @param assetsUsedAsSecurities the assets used as securities
	 */
	@Override
	public void cacheResult(List<AssetsUsedAsSecurity> assetsUsedAsSecurities) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (assetsUsedAsSecurities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AssetsUsedAsSecurity assetsUsedAsSecurity :
				assetsUsedAsSecurities) {

			if (entityCache.getResult(
					AssetsUsedAsSecurityImpl.class,
					assetsUsedAsSecurity.getPrimaryKey()) == null) {

				cacheResult(assetsUsedAsSecurity);
			}
		}
	}

	/**
	 * Clears the cache for all assets used as securities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AssetsUsedAsSecurityImpl.class);

		finderCache.clearCache(AssetsUsedAsSecurityImpl.class);
	}

	/**
	 * Clears the cache for the assets used as security.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssetsUsedAsSecurity assetsUsedAsSecurity) {
		entityCache.removeResult(
			AssetsUsedAsSecurityImpl.class, assetsUsedAsSecurity);
	}

	@Override
	public void clearCache(List<AssetsUsedAsSecurity> assetsUsedAsSecurities) {
		for (AssetsUsedAsSecurity assetsUsedAsSecurity :
				assetsUsedAsSecurities) {

			entityCache.removeResult(
				AssetsUsedAsSecurityImpl.class, assetsUsedAsSecurity);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AssetsUsedAsSecurityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AssetsUsedAsSecurityImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new assets used as security with the primary key. Does not add the assets used as security to the database.
	 *
	 * @param assetsUsedAsSecurityId the primary key for the new assets used as security
	 * @return the new assets used as security
	 */
	@Override
	public AssetsUsedAsSecurity create(long assetsUsedAsSecurityId) {
		AssetsUsedAsSecurity assetsUsedAsSecurity =
			new AssetsUsedAsSecurityImpl();

		assetsUsedAsSecurity.setNew(true);
		assetsUsedAsSecurity.setPrimaryKey(assetsUsedAsSecurityId);

		assetsUsedAsSecurity.setCompanyId(CompanyThreadLocal.getCompanyId());

		return assetsUsedAsSecurity;
	}

	/**
	 * Removes the assets used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security that was removed
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	@Override
	public AssetsUsedAsSecurity remove(long assetsUsedAsSecurityId)
		throws NoSuchAssetsUsedAsSecurityException {

		return remove((Serializable)assetsUsedAsSecurityId);
	}

	/**
	 * Removes the assets used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assets used as security
	 * @return the assets used as security that was removed
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	@Override
	public AssetsUsedAsSecurity remove(Serializable primaryKey)
		throws NoSuchAssetsUsedAsSecurityException {

		Session session = null;

		try {
			session = openSession();

			AssetsUsedAsSecurity assetsUsedAsSecurity =
				(AssetsUsedAsSecurity)session.get(
					AssetsUsedAsSecurityImpl.class, primaryKey);

			if (assetsUsedAsSecurity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetsUsedAsSecurityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(assetsUsedAsSecurity);
		}
		catch (NoSuchAssetsUsedAsSecurityException noSuchEntityException) {
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
	protected AssetsUsedAsSecurity removeImpl(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assetsUsedAsSecurity)) {
				assetsUsedAsSecurity = (AssetsUsedAsSecurity)session.get(
					AssetsUsedAsSecurityImpl.class,
					assetsUsedAsSecurity.getPrimaryKeyObj());
			}

			if (assetsUsedAsSecurity != null) {
				session.delete(assetsUsedAsSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (assetsUsedAsSecurity != null) {
			clearCache(assetsUsedAsSecurity);
		}

		return assetsUsedAsSecurity;
	}

	@Override
	public AssetsUsedAsSecurity updateImpl(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		boolean isNew = assetsUsedAsSecurity.isNew();

		if (!(assetsUsedAsSecurity instanceof AssetsUsedAsSecurityModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(assetsUsedAsSecurity.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					assetsUsedAsSecurity);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in assetsUsedAsSecurity proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AssetsUsedAsSecurity implementation " +
					assetsUsedAsSecurity.getClass());
		}

		AssetsUsedAsSecurityModelImpl assetsUsedAsSecurityModelImpl =
			(AssetsUsedAsSecurityModelImpl)assetsUsedAsSecurity;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (assetsUsedAsSecurity.getCreateDate() == null)) {
			if (serviceContext == null) {
				assetsUsedAsSecurity.setCreateDate(date);
			}
			else {
				assetsUsedAsSecurity.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!assetsUsedAsSecurityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				assetsUsedAsSecurity.setModifiedDate(date);
			}
			else {
				assetsUsedAsSecurity.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(assetsUsedAsSecurity);
			}
			else {
				assetsUsedAsSecurity = (AssetsUsedAsSecurity)session.merge(
					assetsUsedAsSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AssetsUsedAsSecurityImpl.class, assetsUsedAsSecurityModelImpl,
			false, true);

		if (isNew) {
			assetsUsedAsSecurity.setNew(false);
		}

		assetsUsedAsSecurity.resetOriginalValues();

		return assetsUsedAsSecurity;
	}

	/**
	 * Returns the assets used as security with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assets used as security
	 * @return the assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	@Override
	public AssetsUsedAsSecurity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetsUsedAsSecurityException {

		AssetsUsedAsSecurity assetsUsedAsSecurity = fetchByPrimaryKey(
			primaryKey);

		if (assetsUsedAsSecurity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetsUsedAsSecurityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return assetsUsedAsSecurity;
	}

	/**
	 * Returns the assets used as security with the primary key or throws a <code>NoSuchAssetsUsedAsSecurityException</code> if it could not be found.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	@Override
	public AssetsUsedAsSecurity findByPrimaryKey(long assetsUsedAsSecurityId)
		throws NoSuchAssetsUsedAsSecurityException {

		return findByPrimaryKey((Serializable)assetsUsedAsSecurityId);
	}

	/**
	 * Returns the assets used as security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security, or <code>null</code> if a assets used as security with the primary key could not be found
	 */
	@Override
	public AssetsUsedAsSecurity fetchByPrimaryKey(long assetsUsedAsSecurityId) {
		return fetchByPrimaryKey((Serializable)assetsUsedAsSecurityId);
	}

	/**
	 * Returns all the assets used as securities.
	 *
	 * @return the assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @return the range of assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assets used as securities
	 */
	@Override
	public List<AssetsUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsUsedAsSecurity> orderByComparator,
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

		List<AssetsUsedAsSecurity> list = null;

		if (useFinderCache) {
			list = (List<AssetsUsedAsSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ASSETSUSEDASSECURITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ASSETSUSEDASSECURITY;

				sql = sql.concat(AssetsUsedAsSecurityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AssetsUsedAsSecurity>)QueryUtil.list(
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
	 * Removes all the assets used as securities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AssetsUsedAsSecurity assetsUsedAsSecurity : findAll()) {
			remove(assetsUsedAsSecurity);
		}
	}

	/**
	 * Returns the number of assets used as securities.
	 *
	 * @return the number of assets used as securities
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
					_SQL_COUNT_ASSETSUSEDASSECURITY);

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
		return "assetsUsedAsSecurityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ASSETSUSEDASSECURITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AssetsUsedAsSecurityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the assets used as security persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		AssetsUsedAsSecurityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AssetsUsedAsSecurityUtil.setPersistence(null);

		entityCache.removeCache(AssetsUsedAsSecurityImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ASSETSUSEDASSECURITY =
		"SELECT assetsUsedAsSecurity FROM AssetsUsedAsSecurity assetsUsedAsSecurity";

	private static final String _SQL_SELECT_ASSETSUSEDASSECURITY_WHERE =
		"SELECT assetsUsedAsSecurity FROM AssetsUsedAsSecurity assetsUsedAsSecurity WHERE ";

	private static final String _SQL_COUNT_ASSETSUSEDASSECURITY =
		"SELECT COUNT(assetsUsedAsSecurity) FROM AssetsUsedAsSecurity assetsUsedAsSecurity";

	private static final String _SQL_COUNT_ASSETSUSEDASSECURITY_WHERE =
		"SELECT COUNT(assetsUsedAsSecurity) FROM AssetsUsedAsSecurity assetsUsedAsSecurity WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"assetsUsedAsSecurity.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AssetsUsedAsSecurity exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AssetsUsedAsSecurity exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AssetsUsedAsSecurityPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}